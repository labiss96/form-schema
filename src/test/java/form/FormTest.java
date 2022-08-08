package form;

import org.junit.Test;

public class FormTest {

    @Test
    public void test() {
    }

    private static class FieldVisitorImpl implements FieldVisitor {
        @Override
        public void visit(Field.StringField field) {
            System.out.println("string field");
        }

        @Override
        public void visit(Field.NumberField field) {
            System.out.println("number field");
        }

        @Override
        public void visit(Field.BoolField field) {
            System.out.println("boolean field");
        }
    }
}
