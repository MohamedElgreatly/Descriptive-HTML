/* Generated By:JavaCC: Do not edit this line. html.java */
package HTML;
/**
 * Simple brace matcher.
 */
public class html implements htmlConstants {

  /** Main entry point. */
  public static void main(String args[]) throws ParseException {
    /*html parser = new html(System.in);
    parser.Input();*/

  }

  static final public String[] words() throws ParseException {
  String s="";
    jj_consume_token(WORD);
    s = matchedImag();
    jj_consume_token(0);
      System.out.println("parsed correctly "+s);
      s=s.replaceAll("  "," ");
      s=s.replaceAll("   "," ");

if(s.contains("IMAGE")) {//ADD  WITH  "https://www.w3schools.com/html/pic_trulli.jpg"
   String IMG = s.replace("IMAGE WITH SOURCE \u005c" ","<img src=\u005c"");
        IMG = IMG.replace(" \u005c"","\u005c" />");
          s=IMG;
}

else if (s.contains("HEADING")) {
    String W=s;
if (s.contains("FONT") && s.contains("COLOR")  ) {
  if(s.indexOf("COLOR") < s.indexOf("FONT") ) {
        String[] WWW=W.split("WITH FONT \u005c"");
 W=s.replace("HEADING WITH TEXT \u005c"","<h1>" );
   String[] WW=W.split("WITH COLOR \u005c"");
        W= W.replace("WITH COLOR \u005c"","");
        W=W.replace("AND "+WW[1],"");
        W=W.replace(">"," style=\u005c"color:"+WW[1]);
        W=W.replace("WITH FONT \u005c"",";font-family:");
        WW[0]=WWW[1].replace("\u005c"",";\u005c">");
        W=W.replace(WWW[1],WW[0]);
        W= W.replace(" \u005c" AND ","" );
        W= W.replace(" \u005c" ","</h1>" );
  }
  else {
        String[] WWW=W.split("WITH COLOR \u005c"");
 W=s.replace("HEADING WITH TEXT \u005c"","<h1>" );
   String[] WW=W.split("WITH FONT \u005c"");
        W= W.replace("WITH FONT \u005c"","");
        W=W.replace("AND "+WW[1],"");
        W=W.replace(">"," style=\u005c"font-family:"+WW[1]);
        W=W.replace("WITH COLOR \u005c"",";color:");
        WW[0]=WWW[1].replace("\u005c"",";\u005c">");
        W=W.replace(WWW[1],WW[0]);
        W= W.replace(" \u005c" AND ","" );
        W= W.replace(" \u005c" ","</h1>" );
  }

}

else if (s.contains("FONT")) {
   W=s.replace("HEADING WITH TEXT \u005c"","<h1>" );
   String[] WW=W.split("WITH FONT \u005c"");
        W= W.replace("WITH FONT \u005c"","");
        W=W.replace("AND "+WW[1],"");
        WW[1]=WW[1].replace("\u005c"",";\u005c">");
        W=W.replace(">"," style=\u005c"font-family:"+WW[1]);
        W= W.replace(" \u005c"","</h1>" );
  }
else if (s.contains("COLOR")) {
   W=s.replace("HEADING WITH TEXT \u005c"","<h1>" );
   String[] WW=W.split("WITH COLOR \u005c"");
        W= W.replace("WITH COLOR \u005c"","");
        W=W.replace("AND "+WW[1],"");
        WW[1]=WW[1].replace("\u005c"",";\u005c">");
        W=W.replace(">"," style=\u005c"color:"+WW[1]);
        W= W.replace(" \u005c"","</h1>" );
}

 else {
  W=s.replace("HEADING WITH TEXT \u005c"","<h1>" );
  W= W.replace("\u005c"","</h1>" );
  }
  s=W;
}


else if (s.contains("PARAGRAPH") ) {
  String W=s;
if (s.contains("FONT") && s.contains("COLOR")  ) {
  if(s.indexOf("COLOR") < s.indexOf("FONT") ) {
        String[] WWW=W.split("WITH FONT \u005c"");
 W=s.replace("PARAGRAPH WITH TEXT \u005c"","<p>" );
   String[] WW=W.split("WITH COLOR \u005c"");
        W= W.replace("WITH COLOR \u005c"","");
        W=W.replace("AND "+WW[1],"");
        W=W.replace(">"," style=\u005c"color:"+WW[1]);
        W=W.replace("WITH FONT \u005c"",";font-family:");
        WW[0]=WWW[1].replace("\u005c"",";\u005c">");
        W=W.replace(WWW[1],WW[0]);
        W= W.replace(" \u005c" AND ","" );
        W= W.replace(" \u005c" ","</p>" );
  }
  else {
        String[] WWW=W.split("WITH COLOR \u005c"");
 W=s.replace("PARAGRAPH WITH TEXT \u005c"","<p>" );
   String[] WW=W.split("WITH FONT \u005c"");
        W= W.replace("WITH FONT \u005c"","");
        W=W.replace("AND "+WW[1],"");
        W=W.replace(">"," style=\u005c"font-family:"+WW[1]);
        W=W.replace("WITH COLOR \u005c"",";color:");
        WW[0]=WWW[1].replace("\u005c"",";\u005c">");
        W=W.replace(WWW[1],WW[0]);
        W= W.replace(" \u005c" AND ","" );
        W= W.replace(" \u005c" ","</p>" );
  }

}

else if (s.contains("FONT")) {
   W=s.replace("PARAGRAPH WITH TEXT \u005c"","<p>" );
   String[] WW=W.split("WITH FONT \u005c"");
        W= W.replace("WITH FONT \u005c"","");
        W=W.replace("AND "+WW[1],"");
        WW[1]=WW[1].replace("\u005c"",";\u005c">");
        W=W.replace(">"," style=\u005c"font-family:"+WW[1]);
        W= W.replace(" \u005c"","</p>" );
  }
else if (s.contains("COLOR")) {
   W=s.replace("PARAGRAPH WITH TEXT \u005c"","<p>" );
   String[] WW=W.split("WITH COLOR \u005c"");
        W= W.replace("WITH COLOR \u005c"","");
        W=W.replace("AND "+WW[1],"");
        WW[1]=WW[1].replace("\u005c"",";\u005c">");
        W=W.replace(">"," style=\u005c"color:"+WW[1]);
        W= W.replace(" \u005c"","</p>" );
}

 else {
  W=s.replace("PARAGRAPH WITH TEXT \u005c"","<p>" );
  W= W.replace("\u005c"","</p>" );
  }
  s=W;
}

else if (s.contains("LINK")) {
  String[] Li = s.split("AND WITH LINK");
        Li[1]= Li[1].replace(" \u005c" h","<a href=\u005c"h");

        if (Li[1].contains("WITH COLOR" ) && Li[1].contains("WITH FONT" )) {
                if(Li [1].indexOf("COLOR") < Li [1].indexOf("FONT") ) {
                Li[1]= Li[1].replace("WITH COLOR \u005c"","style=\u005c"color:");
                Li[1]= Li[1].replace("WITH FONT \u005c"",";font-family:");
          }

                else {
                Li[1]= Li[1].replace("WITH COLOR \u005c"",";color:");
                Li[1]= Li[1].replace("WITH FONT \u005c"","style=\u005c"font-family:");
                }
                        Li[1]= Li[1].replace("\u005c" ;",";");}

         else if (Li[1].contains("WITH COLOR" ) ) { //" Remain
            Li[1]= Li[1].replace("WITH COLOR \u005c"","style=\u005c"color:");}

          else if (Li[1].contains("WITH FONT") ) {
                Li[1]= Li[1].replace("WITH FONT \u005c"","style=\u005c"font-family:");

          }
          Li[0]=Li[0].replace("LINK WITH TEXT \u005c"",">");
          Li[0]=Li[0].replace("\u005c"","</a>");
        String Final = Li[1]+Li[0];
        Final=Final.replaceAll("\u005c" AND","");
         Final=Final.replaceAll("  "," ");
         s=Final; }

        System.out.println("In HTML: "+s);

//       String Head = s.replace("HEADING WITH TEXT \" ","/" />");
//       Head = Head.replace(" \"","</h1>");
//  	   System.out.println("In HTML: "+Head);

//TODO
String[] ret =new String[2];
ret[0]="parsed correctly";
ret[1]=s;
{if (true) return ret;}
    throw new Error("Missing return statement in function");
  }

  static final public String matchedImag() throws ParseException {
    Token t1=null;
    Token t2=null;
    Token t3=null;
    Token t4=null;
    String s1="";
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case img:
      t1 = jj_consume_token(img);
      t2 = jj_consume_token(quote);
      s1 = matchSentence();
      t3 = jj_consume_token(quote);
      break;
    case header:
      t1 = jj_consume_token(header);
      s1 = matchDecorated();
      break;
    case para:
      t1 = jj_consume_token(para);
      s1 = matchDecorated();
      break;
    case url:
      t1 = jj_consume_token(url);
      s1 = matchURL();
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    if(t3!=null) {
          {if (true) return t1.toString()+" "+t2.toString()+" "+s1+" "+t3.toString();} }
    else {
          {if (true) return t1.toString()+" "+s1;} }
    throw new Error("Missing return statement in function");
  }

  static final public String matchDecorated() throws ParseException {
  Token t2=null;
  String s2="";
  String s3="";
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case text:
      s2 = matchText();
      break;
    case color:
      s2 = matchColor();
      break;
    case font:
      s2 = matchFont();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case and:
      t2 = jj_consume_token(and);
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case text:
    case color:
    case font:
      s3 = matchDecorated();
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    if(t2!=null) {
        {if (true) return s2+" "+t2.toString()+" "+s3;} }
    else {
        {if (true) return s2+" "+s3;} }
    throw new Error("Missing return statement in function");
  }

  static final public String matchURL() throws ParseException {
  String s="";
  String s2="";
  String s3="";
  String s4="";
  Token t=null;
  Token t1=null;
  Token t2=null;
  Token t3=null;
  Token t4=null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case text:
      s = matchText();
      break;
    case color:
      s = matchColor();
      break;
    case font:
      s = matchFont();
      break;
    case link:
      t = jj_consume_token(link);
      t1 = jj_consume_token(quote);
      s3 = matchSentence();
      t2 = jj_consume_token(quote);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case and:
      t3 = jj_consume_token(and);
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case link:
    case text:
    case color:
    case font:
      s4 = matchURL();
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
     if(t1!=null)
       {
         if(t3 !=null) {
             {if (true) return s+t.toString()+" "+t1.toString()+" "+s3+" "+t2.toString()+" "+t3.toString()+" "+s4;}
          }
      else {
          {if (true) return s+" "+t.toString()+" "+t1.toString()+" "+s3+" "+t2.toString()+" "+s4;}
      } }
    else
        {
       if(t3 !=null) {
            {if (true) return s+" "+t3.toString()+" "+s4;} }
       else
          {if (true) return s+" "+s4;}
          }
    throw new Error("Missing return statement in function");
  }

  static final public String matchText() throws ParseException {
  Token t=null;
  Token t1=null;
  Token t2=null;
  String s="";
    t = jj_consume_token(text);
    t1 = jj_consume_token(quote);
    s = matchSentence();
    t2 = jj_consume_token(quote);
     {if (true) return t.toString()+" "+t1.toString()+" "+s+" "+t2.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String matchColor() throws ParseException {
  Token t=null;
  Token t1=null;
  Token t2=null;
  String s="";
    t = jj_consume_token(color);
    t1 = jj_consume_token(quote);
    s = matchSentence();
    t2 = jj_consume_token(quote);
     {if (true) return t.toString()+" "+t1.toString()+" "+s+" "+t2.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String matchFont() throws ParseException {
  Token t=null;
  Token t1=null;
  Token t2=null;
  String s="";
    t = jj_consume_token(font);
    t1 = jj_consume_token(quote);
    s = matchSentence();
    t2 = jj_consume_token(quote);
     {if (true) return t.toString()+" "+t1.toString()+" "+s+" "+t2.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String matchSentence() throws ParseException {
  Token t=null;
  Token t1=null;
  Token t2=null;
  String s="";
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case alphanumeric:
      t = jj_consume_token(alphanumeric);
      break;
    case epslon:
      t = jj_consume_token(epslon);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case alphanumeric:
    case epslon:
      s = matchSentence();
      break;
    default:
      jj_la1[8] = jj_gen;
      ;
    }
     {if (true) return t.toString()+s;}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public htmlTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[9];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xe40,0x7000,0x8000,0x7000,0x7100,0x8000,0x7100,0x30000,0x30000,};
   }

  /** Constructor with InputStream. */
  public html(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public html(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new htmlTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public html(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new htmlTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public html(htmlTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(htmlTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
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
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[18];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 9; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 18; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
