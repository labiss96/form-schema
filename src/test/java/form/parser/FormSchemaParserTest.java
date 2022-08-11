package form.parser;

import form.ast.Field;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class FormSchemaParserTest {

    @Test
    public void test() throws Exception {

        File f = new File("src/test/resources/test-form.txt");
        try (InputStream in = new FileInputStream(f)) {
            form.parser.FormSchemaParser parser = new form.parser.FormSchemaParser(in);

            List<Field> list = parser.schema();
            for(Field e : list) {
                System.out.println(e.toString());
            }
        }
    }

    @Test
    public void fromBlockTest() throws Exception {

        File f = new File("src/test/resources/from-block-form.txt");
        try (InputStream in = new FileInputStream(f)) {
            form.parser.FormSchemaParser parser = new form.parser.FormSchemaParser(in);

            List<Field> list = parser.schema();
            for(Field e : list) {
                System.out.println(e.toString());
            }
        }
    }
}
