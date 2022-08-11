package form.ast;

public interface EnumVisitor {

    void visit(Enum.StringEnum e);

    void visit(Enum.NumberEnum e);

    void visit(Enum.BooleanEnum e);
}
