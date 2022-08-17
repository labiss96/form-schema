/* Generated By:JavaCC: Do not edit this line. ChannelDefParserTokenManager.java */
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

/** Token Manager. */
public class ChannelDefParserTokenManager implements ChannelDefParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400000L) != 0L)
            return 1;
         if ((active0 & 0xf00L) != 0L)
         {
            jjmatchedKind = 24;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0xf00L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0xf00L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x100L) != 0L)
            return 1;
         if ((active0 & 0xe00L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0xe00L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 4;
            return 1;
         }
         return -1;
      case 5:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x600L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 35:
         return jjStopAtPos(0, 21);
      case 36:
         return jjStartNfaWithStates_0(0, 22, 1);
      case 40:
         return jjStopAtPos(0, 12);
      case 41:
         return jjStopAtPos(0, 13);
      case 44:
         return jjStopAtPos(0, 20);
      case 58:
         return jjStopAtPos(0, 19);
      case 59:
         return jjStopAtPos(0, 18);
      case 61:
         return jjStopAtPos(0, 29);
      case 64:
         return jjStopAtPos(0, 23);
      case 91:
         return jjStopAtPos(0, 16);
      case 93:
         return jjStopAtPos(0, 17);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 123:
         return jjStopAtPos(0, 14);
      case 125:
         return jjStopAtPos(0, 15);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 109:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0xc00L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 103:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 1);
         break;
      case 114:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(6, 11, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static final long[] jjbitVec0 = {
   0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec3 = {
   0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec4 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec5 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec6 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec7 = {
   0x1600L, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec8 = {
   0x0L, 0xffc000000000L, 0x0L, 0xffc000000000L
};
static final long[] jjbitVec9 = {
   0x0L, 0x3ff00000000L, 0x0L, 0x3ff000000000000L
};
static final long[] jjbitVec10 = {
   0x0L, 0xffc000000000L, 0x0L, 0xff8000000000L
};
static final long[] jjbitVec11 = {
   0x0L, 0xffc000000000L, 0x0L, 0x0L
};
static final long[] jjbitVec12 = {
   0x0L, 0x3ff0000L, 0x0L, 0x3ff0000L
};
static final long[] jjbitVec13 = {
   0x0L, 0x3ffL, 0x0L, 0x0L
};
static final long[] jjbitVec14 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec15 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 20;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     jjCheckNAdd(2);
                  }
                  else if (curChar == 47)
                     jjAddStates(0, 1);
                  else if (curChar == 34)
                     jjCheckNAddStates(2, 4);
                  else if (curChar == 36)
                  {
                     if (kind > 24)
                        kind = 24;
                     jjCheckNAdd(1);
                  }
                  break;
               case 1:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(2);
                  break;
               case 3:
               case 6:
                  if (curChar == 34)
                     jjCheckNAddStates(2, 4);
                  break;
               case 4:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 7:
                  if (curChar == 34 && kind > 28)
                     kind = 28;
                  break;
               case 8:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 9:
                  if (curChar == 47)
                     jjCheckNAddStates(5, 7);
                  break;
               case 10:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 11:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 12:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 13:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 15:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 16:
                  if (curChar == 42)
                     jjCheckNAddStates(8, 10);
                  break;
               case 17:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(18, 16);
                  break;
               case 18:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(18, 16);
                  break;
               case 19:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(1);
                  break;
               case 4:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 5:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 10:
                  jjAddStates(5, 7);
                  break;
               case 15:
                  jjCheckNAddTwoStates(15, 16);
                  break;
               case 17:
               case 18:
                  jjCheckNAddTwoStates(18, 16);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 24)
                        kind = 24;
                     jjCheckNAdd(1);
                  }
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 25)
                        kind = 25;
                     jjCheckNAdd(2);
                  }
                  break;
               case 1:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(2);
                  break;
               case 4:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjAddStates(2, 4);
                  break;
               case 10:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjAddStates(5, 7);
                  break;
               case 15:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 17:
               case 18:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(18, 16);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 20 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   9, 14, 4, 5, 7, 10, 11, 13, 16, 17, 19, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec3[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 51:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 61:
         return ((jjbitVec6[i2] & l2) != 0L);
      default : 
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 6:
         return ((jjbitVec9[i2] & l2) != 0L);
      case 11:
         return ((jjbitVec10[i2] & l2) != 0L);
      case 13:
         return ((jjbitVec11[i2] & l2) != 0L);
      case 14:
         return ((jjbitVec12[i2] & l2) != 0L);
      case 16:
         return ((jjbitVec13[i2] & l2) != 0L);
      default : 
         if ((jjbitVec7[i1] & l1) != 0L)
            if ((jjbitVec8[i2] & l2) == 0L)
               return false;
            else
            return true;
         return false;
   }
}
private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec15[i2] & l2) != 0L);
      default : 
         if ((jjbitVec14[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\145\156\165\155", 
"\163\164\162\151\156\147", "\156\165\155\142\145\162", "\142\157\157\154\145\141\156", "\50", "\51", 
"\173", "\175", "\133", "\135", "\73", "\72", "\54", "\43", "\44", "\100", null, null, 
null, null, null, "\75", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x33ffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
static final long[] jjtoSpecial = {
   0xc0L, 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[20];
private final int[] jjstateSet = new int[40];
protected char curChar;
/** Constructor. */
public ChannelDefParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ChannelDefParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 20; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
