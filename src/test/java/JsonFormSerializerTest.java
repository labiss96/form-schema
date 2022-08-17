import form.JsonFormSerializer;
import form.ast.Field;
import form.channel.ChannelDefParser;
import form.parser.FormSchemaParser;
import org.json.JSONObject;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class JsonFormSerializerTest {

    @Test
    public void test() throws Exception {
        File f = new File("src/test/resources/test-form.txt");
        try (InputStream in = new FileInputStream(f)) {
            FormSchemaParser parser = new FormSchemaParser(in);

            List<Field> list = parser.schema();

            JSONObject json = JsonFormSerializer.execute(list);
            System.out.println(json);
        }
    }

    @Test
    public void fromCompTest() throws Exception {
        File f = new File("target/from-block-form.txt");
        try (InputStream in = new FileInputStream(f)) {
            FormSchemaParser parser = new FormSchemaParser(in);

            List<Field> list = parser.schema();

            JSONObject json = JsonFormSerializer.execute(list);
            System.out.println(json);
        }
    }

}
