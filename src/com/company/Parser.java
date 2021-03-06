
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\007\003\000\002\002\004\000\002\011" +
    "\004\000\002\010\004\000\002\010\003\000\002\004\004" +
    "\000\002\004\003\000\002\003\007\000\002\005\006\000" +
    "\002\005\005\000\002\012\005\000\002\012\003\000\002" +
    "\014\010\000\002\015\005\000\002\015\005\000\002\002" +
    "\003\000\002\002\003\000\002\006\005\000\002\006\003" +
    "\000\002\006\005\000\002\013\003\000\002\013\003\000" +
    "\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\004\017\007\001\002\000\004\002\061\001" +
    "\002\000\004\017\053\001\002\000\004\017\ufffb\001\002" +
    "\000\004\005\011\001\002\000\004\002\001\001\002\000" +
    "\004\016\012\001\002\000\012\005\022\007\014\012\016" +
    "\017\020\001\002\000\020\004\uffef\006\uffef\010\uffef\011" +
    "\uffef\013\uffef\014\uffef\015\uffef\001\002\000\020\004\uffec" +
    "\006\uffec\010\uffec\011\uffec\013\uffec\014\uffec\015\uffec\001" +
    "\002\000\020\004\uffeb\006\uffeb\010\uffeb\011\uffeb\013\uffeb" +
    "\014\uffeb\015\uffeb\001\002\000\012\005\022\007\014\012" +
    "\016\017\020\001\002\000\020\004\026\006\ufff2\010\ufff2" +
    "\011\ufff2\013\ufff2\014\ufff2\015\ufff2\001\002\000\022\004" +
    "\uffed\005\031\006\uffed\010\uffed\011\uffed\013\uffed\014\uffed" +
    "\015\uffed\001\002\000\004\010\030\001\002\000\010\005" +
    "\022\007\014\017\020\001\002\000\016\006\ufff1\010\ufff1" +
    "\011\ufff1\013\ufff1\014\ufff1\015\ufff1\001\002\000\006\004" +
    "\026\006\025\001\002\000\020\004\uffee\006\uffee\010\uffee" +
    "\011\uffee\013\uffee\014\uffee\015\uffee\001\002\000\006\007" +
    "\014\017\020\001\002\000\020\004\ufff0\006\ufff0\010\ufff0" +
    "\011\ufff0\013\ufff0\014\ufff0\015\ufff0\001\002\000\004\017" +
    "\ufffa\001\002\000\014\005\022\006\033\007\014\012\016" +
    "\017\020\001\002\000\006\006\036\011\035\001\002\000" +
    "\024\002\ufff8\004\ufff8\006\ufff8\010\ufff8\011\ufff8\013\ufff8" +
    "\014\ufff8\015\ufff8\017\ufff8\001\002\000\006\006\ufff6\011" +
    "\ufff6\001\002\000\012\005\022\007\014\012\016\017\020" +
    "\001\002\000\024\002\ufff9\004\ufff9\006\ufff9\010\ufff9\011" +
    "\ufff9\013\ufff9\014\ufff9\015\ufff9\017\ufff9\001\002\000\006" +
    "\006\ufff7\011\ufff7\001\002\000\006\014\046\015\047\001" +
    "\002\000\004\006\042\001\002\000\012\005\022\007\014" +
    "\012\016\017\020\001\002\000\004\013\044\001\002\000" +
    "\012\005\022\007\014\012\016\017\020\001\002\000\016" +
    "\006\ufff5\010\ufff5\011\ufff5\013\ufff5\014\ufff5\015\ufff5\001" +
    "\002\000\012\005\022\007\014\012\016\017\020\001\002" +
    "\000\012\005\022\007\014\012\016\017\020\001\002\000" +
    "\004\006\ufff3\001\002\000\004\006\ufff4\001\002\000\004" +
    "\017\ufffc\001\002\000\004\005\060\001\002\000\004\002" +
    "\uffff\001\002\000\006\002\ufffd\017\056\001\002\000\004" +
    "\005\031\001\002\000\004\002\ufffe\001\002\000\016\005" +
    "\022\006\033\007\014\012\016\016\012\017\020\001\002" +
    "\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\012\003\005\004\004\007\003\011\007\001" +
    "\001\000\002\001\001\000\010\003\051\005\054\010\053" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\002\020\005\014\006\016" +
    "\013\012\014\022\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\002\037\005\014\006\016" +
    "\013\012\014\022\015\040\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\005\014\006\023" +
    "\013\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\005\014\013\026\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\002\033\005\014\006" +
    "\016\012\031\013\012\014\022\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\002\036\005" +
    "\014\006\016\013\012\014\022\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\014\002\042\005\014\006\016\013\012\014\022\001\001" +
    "\000\002\001\001\000\014\002\044\005\014\006\016\013" +
    "\012\014\022\001\001\000\002\001\001\000\014\002\050" +
    "\005\014\006\016\013\012\014\022\001\001\000\014\002" +
    "\047\005\014\006\016\013\012\014\022\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\054\010\056\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\002\033\005" +
    "\014\006\016\012\031\013\012\014\022\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    // Connect this parser to a scanner!
    Scanner s;
    Parser(Scanner s){ this.s=s; }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {




        class Functions{
            int num=0;

            public String SetStringInParameters(String str)
            {
                String out,tmp;

                str=str.substring(0, str.lastIndexOf(")"));

                if(str == null || str.isEmpty()){return "";}


                out="String "+str;
                int index = out.indexOf(",");

                while (index >= 0) {

                    out=out.substring(0,index)+",String "+out.substring(index+1,out.length());
                    index = out.indexOf(",", index + 1);

                }
                return out;
            }
        }

        Functions fun=new Functions();





  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // programme ::= main_body 
            {
              Object RESULT =null;
		int mbleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int mbright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object mb = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		System.out.println("public class Out {\t\n"+mb+"\n"+"}");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("programme",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= programme EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // main_body ::= function_decls function_calls 
            {
              Object RESULT =null;
		int fdleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int fdright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object fd = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int fcsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fcsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object fcs = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT="\tpublic static void main(String[] args) {\n"+fcs+"\n"+"\t}\n"+fd;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_body",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // function_calls ::= function_call function_calls 
            {
              Object RESULT =null;
		int fcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int fcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object fc = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int fcsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fcsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object fcs = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT="\t\tSystem.out.println("+fc+");\n"+fcs;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_calls",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // function_calls ::= function_call 
            {
              Object RESULT =null;
		int fcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object fc = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT="\t\tSystem.out.println("+fc+");\n";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_calls",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // function_decls ::= function_decls function_decl 
            {
              Object RESULT =null;
		int fdsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int fdsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object fds = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int fdleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fdright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object fd = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=(String)fd+(String)fds;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_decls",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // function_decls ::= function_decl 
            {
              Object RESULT =null;
		int fdleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fdright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object fd = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=(String)fd;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_decls",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // function_decl ::= IDENTIFIER LPAREN PARAMETERS_DECL expr RBRACKET 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int pdleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int pdright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object pd = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int inleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int inright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object in = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT="\tpublic static String "+id+"("+fun.SetStringInParameters((String)pd)+")"+
                                                                                                                                            "{\n"+"\t\t"+"return "+in+";"+"\n"+"\t}\n";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_decl",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // function_call ::= IDENTIFIER LPAREN parameters_call RPAREN 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT=id+"("+p+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_call",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // function_call ::= IDENTIFIER LPAREN RPAREN 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		RESULT=id+"("+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_call",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parameters_call ::= parameters_call COMMA expr 
            {
              Object RESULT =null;
		int pcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int pcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object pc = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=pc+","+e;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameters_call",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // parameters_call ::= expr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=e;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameters_call",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // if_statement ::= IF conditional_statement RPAREN expr ELSE expr 
            {
              Object RESULT =null;
		int csleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int csright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object cs = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT="("+"("+cs+")"+"?"+"("+e1+")"+":"+"("+e2+")"+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_statement",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // conditional_statement ::= expr PREFIX expr 
            {
              Object RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object s1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT="("+s1+")"+".startsWith("+s2+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conditional_statement",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // conditional_statement ::= expr SUFFIX expr 
            {
              Object RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object s1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT="("+s1+")"+".endsWith("+s2+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conditional_statement",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= statement 
            {
              Object RESULT =null;
		int stleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int stright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object st = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=st;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= if_statement 
            {
              Object RESULT =null;
		int isleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int isright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object is = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=is;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // statement ::= statement PLUS object 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=s+"+"+o;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // statement ::= object 
            {
              Object RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=o;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // statement ::= LPAREN statement RPAREN 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT="("+e+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // object ::= IDENTIFIER 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=id;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("object",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // object ::= STRING 
            {
              Object RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int strright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object str = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=str;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("object",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // object ::= function_call 
            {
              Object RESULT =null;
		int fcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object fc = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=fc;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("object",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
