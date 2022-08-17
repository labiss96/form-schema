package form.ast;

import org.apache.commons.lang3.StringEscapeUtils;

@SuppressWarnings("deprecation")
public class StringUtils {
    public static String unquote(String s) {
        int len = s.length();
        String str = s.substring(1, len - 1);
        return StringEscapeUtils.unescapeJava(str);
    }

    public static String quote(String s) {
        return "\"" + StringEscapeUtils.escapeJava(s) + "\"";
    }
}
