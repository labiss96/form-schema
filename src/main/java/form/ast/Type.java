package form.ast;

public enum Type {
    STRING("string"),
    NUMBER("number"),
    BOOL("boolean");

    private String value;
    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Type getType(String value) {
        for(Type v : values())
            if(v.getValue().equalsIgnoreCase(value)) return v;
        throw new IllegalArgumentException();
    }
}
