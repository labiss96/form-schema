package form;

import form.ast.Enum;
import form.ast.EnumVisitor;
import form.ast.Field;
import form.ast.FieldVisitor;
import form.ast.Type;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormSchemaInterpreter implements FieldVisitor, EnumVisitor {

    public FormSchemaInterpreter() {
    }

    public static JSONObject execute(List<Field> form) {
        FormSchemaInterpreter fsi = new FormSchemaInterpreter();
        fsi.root = new JSONObject();
        fsi.root.put("title", "Properties");
        fsi.root.put("type", "object");

        fsi.props = new JSONObject();

        for (Field field : form) {
            field.accept(fsi);
        }

        return fsi.root;
    }

    private JSONObject root;
    private JSONObject props;

    @Override
    public void visit(Field.DefaultField field) {
        JSONObject prop = new JSONObject();
        Map<String, String> map = field.option != null ? field.option : new HashMap<>();

        prop.put("type", typeOf(field.type));
        if (map.containsKey("title"))
            prop.put("title", map.get("title"));
        if (map.containsKey("defaultValue"))
            defaultValue(prop, field.type, map.get("defaultValue"));

        if (field.enumList != null)
            for (Enum e : field.enumList)
                e.accept(this);

//        if(field.enumList != null) {
//            JSONArray jsonEnums = new JSONArray();
//            JSONArray jsonEnumNames = new JSONArray();
//            List<Enum> enums = field.enumList;
//            for (Enum e : enums) {
//                jsonEnums.put(e.id);
//                if (e.name != null) jsonEnumNames.put(e.name);
//                else jsonEnumNames.put(e.id);
//            }
//        }
//        if(field.enumsRef != null)

        props.put(field.id, prop);
    }

    private static void defaultValue(JSONObject prop, Type type, String defaultValue) {
        switch (type) {
            case STRING:
                prop.put("default", defaultValue);
            case NUMBER:
                prop.put("default", Integer.valueOf(defaultValue));
            case BOOL:
                prop.put("default", Boolean.parseBoolean(defaultValue));
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

    @Override
    public void visit(Enum.StringEnum e) {

    }

    @Override
    public void visit(Enum.NumberEnum e) {

    }

    @Override
    public void visit(Enum.BooleanEnum e) {

    }
}
