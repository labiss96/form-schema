package form;

import form.ast.Enum;
import form.ast.Field;
import form.ast.FieldVisitor;
import form.ast.Type;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonFormSerializer implements FieldVisitor {

    public JsonFormSerializer() {
    }

    public static JSONObject execute(List<Field> form) {
        JsonFormSerializer jfs = new JsonFormSerializer();
        jfs.root = new JSONObject();
        jfs.root.put("title", "Properties");
        jfs.root.put("type", "object");

        jfs.props = new JSONObject();
        jfs.dependencies = new JSONObject();
        jfs.orderArr = new JSONArray();

        for (Field field : form)
            field.accept(jfs);

        jfs.root.put("properties", jfs.props);
        jfs.root.put("dependencies", jfs.dependencies);
        jfs.root.put("ui:order", jfs.orderArr);

        return jfs.root;
    }

    private JSONObject root;
    private JSONObject props;
    private JSONObject dependencies;
    private JSONArray orderArr;

    @Override
    public void visit(Field.DefaultField field) {
        orderArr.put(field.id);
        JSONObject prop = new JSONObject();
        Map<String, String> map = field.option != null ? field.option : new HashMap<>();

        if (field.type != null)
            prop.put("type", typeOf(field.type));
        if (map.containsKey("title"))
            prop.put("title", map.get("title"));
        if (map.containsKey("defaultValue"))
            defaultValue(prop, field.type, map.get("defaultValue"));

        if (field.enumList != null) {
            JSONArray jsonEnums = new JSONArray();
            JSONArray jsonEnumNames = new JSONArray();
            List<Enum> enums = field.enumList;
            for (Enum e : enums) {
                jsonEnums.put(e.key);
                if (e.name != null) jsonEnumNames.put(e.name);
                else jsonEnumNames.put(e.key);

                if (e.form != null) {
                    for (Field f : e.form) {
                        f.accept(this);
                    }
                }
                if (e.formRef != null) {
                    Field.DefaultField f = new Field.DefaultField();
                    f.parentId = field.id;
                    f.parentValue = e.key;
                    f.enumsRef = e.formRef;
                    f.id = e.formRef;
                    f.accept(this);
                }
            }
            prop.put("enum", jsonEnums);
            prop.put("enumNames", jsonEnumNames);
        }
        if (field.enumsRef != null) setReference(prop, field.enumsRef);

        if (field.parentId == null)
            props.put(field.id, prop);
        else {
            JSONObject oneOf;
            if (dependencies.has(field.parentId)) oneOf = dependencies.getJSONObject(field.parentId);
            else oneOf = new JSONObject();

            JSONArray depArr;
            if (oneOf.has("oneOf")) depArr = oneOf.getJSONArray("oneOf");
            else depArr = new JSONArray();

            Iterator<Object> iter = depArr.iterator();
            boolean putFlag = false;
            while (iter.hasNext()) {
                JSONObject iterPropWrap = (JSONObject) iter.next();
                JSONObject iterProp = iterPropWrap.getJSONObject("properties");
                if (iterProp.has(field.parentId)) {
                    JSONObject tgtId = iterProp.getJSONObject(field.parentId);
                    JSONArray tgtEnum = tgtId.getJSONArray("enum");
                    if (tgtEnum.get(0).equals(field.parentValue)) {
                        iterProp.put(field.id, prop);
                        putFlag = true;
                    }
                }
            }

            if (!putFlag) {
                JSONObject depPropsWrap = new JSONObject();
                JSONObject depProps = new JSONObject();
                JSONObject parentProp = new JSONObject();
                JSONArray parentArr = new JSONArray();

                parentArr.put(field.parentValue);
                parentProp.put("enum", parentArr);
                depProps.put(field.parentId, parentProp);
                depProps.put(field.id, prop);
                depPropsWrap.put("properties", depProps);
                depArr.put(depPropsWrap);
            }
            oneOf.put("oneOf", depArr);

            dependencies.put(field.parentId, oneOf);
        }
    }

    private static void setReference(JSONObject prop, String ref) {
        prop.put("$ref", "@/definitions/" + ref);
        prop.put("type", "object");
    }

    private static void defaultValue(JSONObject prop, Type type, String defaultValue) {
        switch (type) {
            case STRING:
                prop.put("default", defaultValue);
                break;
            case NUMBER:
                prop.put("default", Integer.valueOf(defaultValue));
                break;
            case BOOL:
                prop.put("default", Boolean.parseBoolean(defaultValue));
                break;
            default:
                new RuntimeException("Invalid Field Type.");
        }
    }

    private static String typeOf(Type type) {
        switch (type) {
            case STRING:
                return "string";
            case NUMBER:
                return "number";
            case BOOL:
                return "boolean";
            default:
                throw new RuntimeException("Invalid Field Type.");
        }
    }
}
