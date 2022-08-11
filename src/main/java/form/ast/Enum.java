package form.ast;

import java.util.List;

//public class Enum {
//    public String id;
//    public String name;
//    public List<Field> form;
//    public String formRef;
//
//    @Override
//    public String toString() {
//        return "Enum{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", form=" + form +
//                ", formRef='" + formRef + '\'' +
//                '}';
//    }
//}

public abstract class Enum {

    public abstract void accept(EnumVisitor visitor);

    public static class StringEnum extends Enum {
        public String key;
        public String name;
        public List<Field> form;
        public String formRef;

        @Override
        public void accept(EnumVisitor visitor) {
            visitor.visit(this);
        }
    }

    public static class NumberEnum extends Enum {
        public Integer key;
        public String name;
        public List<Field> form;
        public String formRef;

        @Override
        public void accept(EnumVisitor visitor) {
            visitor.visit(this);
        }
    }

    public static class BooleanEnum extends Enum {
        public boolean key;
        public List<Field> form;
        public String formRef;

        @Override
        public void accept(EnumVisitor visitor) {
            visitor.visit(this);
        }
    }
}
