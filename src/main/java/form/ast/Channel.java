package form.ast;

import java.util.List;

public class Channel {
    public String id;
    public String name;
    public List<Field> form;

    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", form=" + form +
                '}';
    }
}
