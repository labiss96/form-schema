package form;

public interface FieldVisitor {

    void visit(Field.StringField field);

    void visit(Field.NumberField field);

    void visit(Field.BoolField field);
}
