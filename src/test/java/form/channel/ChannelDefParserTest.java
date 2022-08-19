package form.channel;

import form.channel.ChannelDefParser;
import form.ast.Field;
import form.ast.Channel;
import form.parser.FormSchemaParser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class ChannelDefParserTest {

    @Test
    public void test() throws Exception {
        File f = new File("src/test/resources/test-ch-def.txt");
        try (InputStream in = new FileInputStream(f)) {
            ChannelDefParser parser = new ChannelDefParser(in);

            List<Channel> list = parser.channels();
            for(Channel ch : list) {
                System.out.println(ch.form);
                if (ch.form == null) continue;
                try (InputStream sin = new ByteArrayInputStream(ch.form.getBytes())) {
                    FormSchemaParser fsp = new FormSchemaParser(sin);
                    List<Field> form = fsp.schema();
                    for (Field field : form) {
                        System.out.println(field);
                    }
                }
                System.out.println("-------------------");
            }
        }
    }
}
