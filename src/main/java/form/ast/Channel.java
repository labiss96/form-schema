package form.ast;

public class Channel {
    public String id;
    public String name;
    public String form;

    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", form=" + form +
                '}';
    }
}
