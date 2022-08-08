package form;

import java.util.List;
import java.util.Map;

public abstract class Field {

    public abstract void accept(FieldVisitor visitor);

    private String id;
    private Map<String, String> option;
    private List<Enum> enumList;
    private String enumsRef;

    public static class StringField extends Field {
        @Override
        public void accept(FieldVisitor visitor) {
            visitor.visit(this);
        }
    }

    public static class NumberField extends Field {
        @Override
        public void accept(FieldVisitor visitor) {
            visitor.visit(this);
        }
    }

    public static class BoolField extends Field {
        @Override
        public void accept(FieldVisitor visitor) {
            visitor.visit(this);
        }
    }

}
