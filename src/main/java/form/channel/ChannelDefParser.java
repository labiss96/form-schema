/* Generated By:JavaCC: Do not edit this line. ChannelDefParser.java */
package form.channel;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import form.ast.Channel;
import form.ast.Enum;
import form.ast.Field;
import form.ast.Field.DefaultField;
import form.ast.StringUtils;
import form.ast.Type;

public class ChannelDefParser implements ChannelDefParserConstants {

/*
Channels := Channel ( "," Channel )*
Channel := <IDENT> ":" <STRING> [ "(" Form ")" ]
Form := ( Field ";" )+
Field := <IDENT> ":" Type [ "{" Option ( "," Option )* "}" ] [ Enums | EnumsRef ]
Type := "string" | "number" | "boolean"
Option := <IDENT> "=" <STRING>
Enums := "[" Enum ( "," Enum )* "]"
Enum := <STRING> [ ":" <STRING> ] [ ( "{" Form "}" ) | FormRef ]
EnumsRef := "#" <IDENT>
FormRef := "@" <IDENT>
*/

//Channels := Channel ( "," Channel )*
  final public List<Channel> channels() throws ParseException {
  List<Channel> chs = new ArrayList(); Channel ch;
    ch = channel();
                   chs.add(ch);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(COMMA);
      ch = channel();
                                                       chs.add(ch);
    }
    jj_consume_token(0);
      {if (true) return chs;}
    throw new Error("Missing return statement in function");
  }

//Channel := <IDENT> ":" <STRING> [ "(" Form ")" ]
  final public Channel channel() throws ParseException {
  Token t; Token cn; List<Field> f; Channel ch = new Channel();
    t = jj_consume_token(IDENT);
    jj_consume_token(COLON);
    cn = jj_consume_token(STRING);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LPAREN:
      jj_consume_token(LPAREN);
      f = form(null, null);
                                                        ch.form=f;
      jj_consume_token(RPAREN);
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
      ch.id=t.image; ch.name=StringUtils.unquote(cn.image); {if (true) return ch;}
    throw new Error("Missing return statement in function");
  }

// Form := ( Field ";" )+
  final public List<Field> form(String parentId, String parentVal) throws ParseException {
  List<Field> l = new ArrayList(); Field field = null;
    label_2:
    while (true) {
      field = field(parentId, parentVal);
                                          l.add(field);
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENT:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
    }
      {if (true) return l;}
    throw new Error("Missing return statement in function");
  }

//Field := <IDENT> ":" Type [ "{" Option ( "," Option )* "}" ] [ Enums | EnumsRef ]
  final public Field field(String parentId, String parentVal) throws ParseException {
 Token t; Type ty; Map<String, String> o = new HashMap(); List<Enum> e; String er; DefaultField f = new DefaultField();
    t = jj_consume_token(IDENT);
    jj_consume_token(COLON);
    ty = type();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LBRACE:
      jj_consume_token(LBRACE);
      option(o);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_3;
        }
        jj_consume_token(COMMA);
        option(o);
      }
      jj_consume_token(RBRACE);
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LBRACKET:
    case SHARP:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LBRACKET:
        e = enums(t.image);
                                                                                       f.enumList= e;
        break;
      case SHARP:
        er = enumRef();
                                                                                                                         f.enumsRef=er;
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
     f.id=t.image; f.type=ty; f.option=o; f.parentId=parentId; f.parentValue=parentVal; {if (true) return f;}
    throw new Error("Missing return statement in function");
  }

//Type := "string" | "number" | "boolean"
  final public Type type() throws ParseException {
  Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_T:
      t = jj_consume_token(STRING_T);
      break;
    case NUMBER_T:
      t = jj_consume_token(NUMBER_T);
      break;
    case BOOLEAN:
      t = jj_consume_token(BOOLEAN);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
      {if (true) return Type.getType(t.image);}
    throw new Error("Missing return statement in function");
  }

//Option := <IDENT> "=" <STRING>
  final public void option(Map<String, String> o) throws ParseException {
  Token k; Token s;
    k = jj_consume_token(IDENT);
    jj_consume_token(29);
    s = jj_consume_token(STRING);
                                 o.put(k.image, StringUtils.unquote(s.image));
  }

//Enums := "[" Enum ( "," Enum )* "]"
  final public List<Enum> enums(String fieldId) throws ParseException {
  List<Enum> enums = new ArrayList();
    jj_consume_token(LBRACKET);
    _enum(enums, fieldId);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
      jj_consume_token(COMMA);
      _enum(enums, fieldId);
    }
    jj_consume_token(RBRACKET);
      {if (true) return enums;}
    throw new Error("Missing return statement in function");
  }

//Enum := <STRING> [ ":" <STRING> ] [ ( "{" Form "}" ) | FormRef ]
  final public void _enum(List<Enum> enums, String fieldId) throws ParseException {
 Token key; Token n; List<Field> f; String fr; Enum e = new Enum();
    key = jj_consume_token(STRING);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COLON:
      jj_consume_token(COLON);
      n = jj_consume_token(STRING);
                                      e.name=StringUtils.unquote(n.image);
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LBRACE:
    case AT:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LBRACE:
        jj_consume_token(LBRACE);
        f = form(fieldId, StringUtils.unquote(key.image));
        jj_consume_token(RBRACE);
                                                                                                                                             e.form=f;
        break;
      case AT:
        fr = formRef();
                                                                                                                                                                          e.formRef=fr;
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
      e.key=StringUtils.unquote(key.image); enums.add(e);
  }

//EnumsRef := "#" <IDENT>
  final public String enumRef() throws ParseException {
  Token t;
    jj_consume_token(SHARP);
    t = jj_consume_token(IDENT);
      {if (true) return t.image;}
    throw new Error("Missing return statement in function");
  }

//FormRef := "@" <IDENT>
  final public String formRef() throws ParseException {
  Token t;
    jj_consume_token(AT);
    t = jj_consume_token(IDENT);
      {if (true) return t.image;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public ChannelDefParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x100000,0x1000,0x1000000,0x100000,0x4000,0x210000,0x210000,0xe00,0x100000,0x80000,0x804000,0x804000,};
   }

  /** Constructor with InputStream. */
  public ChannelDefParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ChannelDefParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ChannelDefParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ChannelDefParser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new ChannelDefParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ChannelDefParser(ChannelDefParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ChannelDefParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List jj_expentries = new java.util.ArrayList();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[30];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 30; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
