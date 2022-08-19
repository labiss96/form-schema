/* Generated By:JavaCC: Do not edit this line. ChannelDefParserConstants.java */
package form.channel;


/** 
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ChannelDefParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 7;
  /** RegularExpression Id. */
  int START_FORM = 8;
  /** RegularExpression Id. */
  int TEXT = 9;
  /** RegularExpression Id. */
  int END_FORM = 10;
  /** RegularExpression Id. */
  int COLON = 11;
  /** RegularExpression Id. */
  int COMMA = 12;
  /** RegularExpression Id. */
  int IDENT = 13;
  /** RegularExpression Id. */
  int NUMBER = 14;
  /** RegularExpression Id. */
  int LETTER = 15;
  /** RegularExpression Id. */
  int DIGIT = 16;
  /** RegularExpression Id. */
  int STRING = 17;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_FORM_CONTENT = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "\"(\"",
    "<TEXT>",
    "\")\"",
    "\":\"",
    "\",\"",
    "<IDENT>",
    "<NUMBER>",
    "<LETTER>",
    "<DIGIT>",
    "<STRING>",
  };

}
