package form.ast;

import java.util.List;

public class Enum {
    public String key;
    public String name;
    public List<Field> form;
    public String formRef;

    @Override
    public String toString() {
        return "Enum{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", form=" + form +
                ", formRef='" + formRef + '\'' +
                '}';
    }
}