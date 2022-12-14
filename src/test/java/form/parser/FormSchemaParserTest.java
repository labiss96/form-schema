package form.parser;

import form.ast.Field;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import form.parser.FormSchemaParser;

public class FormSchemaParserTest {

    @Test
    public void test() throws Exception {

        File f = new File("src/test/resources/test-form.txt");
        try (InputStream in = new FileInputStream(f)) {
            FormSchemaParser parser = new FormSchemaParser(in);

            List<Field> list = parser.schema();
            for(Field e : list) {
                System.out.println(e.toString());
            }
        }
    }

    @Test
    public void fromBlockTest() throws Exception {

        File f = new File("target/from-block-form.txt");
        try (InputStream in = new FileInputStream(f)) {
            FormSchemaParser parser = new FormSchemaParser(in);

            List<Field> list = parser.schema();
            for(Field e : list) {
                System.out.println(e.toString());
            }
        }
    }
}
