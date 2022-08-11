package form.ast;

import java.util.List;
import java.util.Map;

public abstract class Field {

    public abstract void accept(FieldVisitor visitor);

    public static class DefaultField extends Field {
        public String id;
        public Type type;
        public Map<String, String> option;
        public List<Enum> enumList;
        public String enumsRef;

        @Override
        public void accept(FieldVisitor visitor) {
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "Field{" +
                    "id='" + id + '\'' +
                    ", type=" + type +
                    ", option=" + option +
                    ", enumList=" + enumList +
                    ", enumsRef='" + enumsRef + '\'' +
                    '}';
        }
    }
}