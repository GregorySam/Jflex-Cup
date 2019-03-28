
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
    "\000\030\000\002\011\003\000\002\002\004\000\002\013" +
    "\004\000\002\012\004\000\002\012\003\000\002\004\004" +
    "\000\002\004\003\000\002\003\007\000\002\003\010\000" +
    "\002\005\006\000\002\005\005\000\002\014\005\000\002" +
    "\014\003\000\002\016\010\000\002\017\005\000\002\017" +
    "\005\000\002\002\003\000\002\002\003\000\002\010\005" +
    "\000\002\010\003\000\002\010\005\000\002\015\003\000" +
    "\002\015\003\000\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\017\007\001\002\000\004\002\066\001" +
    "\002\000\004\017\057\001\002\000\004\017\ufffb\001\002" +
    "\000\004\005\011\001\002\000\004\002\001\001\002\000" +
    "\006\006\012\016\013\001\002\000\004\010\053\001\002" +
    "\000\012\005\023\007\015\012\017\017\021\001\002\000" +
    "\020\004\uffee\006\uffee\010\uffee\011\uffee\013\uffee\014\uffee" +
    "\015\uffee\001\002\000\020\004\uffeb\006\uffeb\010\uffeb\011" +
    "\uffeb\013\uffeb\014\uffeb\015\uffeb\001\002\000\020\004\uffea" +
    "\006\uffea\010\uffea\011\uffea\013\uffea\014\uffea\015\uffea\001" +
    "\002\000\010\005\023\007\015\017\021\001\002\000\010" +
    "\004\027\010\ufff1\013\ufff1\001\002\000\022\004\uffec\005" +
    "\032\006\uffec\010\uffec\011\uffec\013\uffec\014\uffec\015\uffec" +
    "\001\002\000\004\010\031\001\002\000\010\005\023\007" +
    "\015\017\021\001\002\000\006\010\ufff0\013\ufff0\001\002" +
    "\000\006\004\027\006\026\001\002\000\020\004\uffed\006" +
    "\uffed\010\uffed\011\uffed\013\uffed\014\uffed\015\uffed\001\002" +
    "\000\006\007\015\017\021\001\002\000\020\004\uffef\006" +
    "\uffef\010\uffef\011\uffef\013\uffef\014\uffef\015\uffef\001\002" +
    "\000\004\017\ufffa\001\002\000\012\005\023\006\033\007" +
    "\015\017\021\001\002\000\024\002\ufff7\004\ufff7\006\ufff7" +
    "\010\ufff7\011\ufff7\013\ufff7\014\ufff7\015\ufff7\017\ufff7\001" +
    "\002\000\006\006\037\011\036\001\002\000\010\004\027" +
    "\006\ufff5\011\ufff5\001\002\000\010\005\023\007\015\017" +
    "\021\001\002\000\024\002\ufff8\004\ufff8\006\ufff8\010\ufff8" +
    "\011\ufff8\013\ufff8\014\ufff8\015\ufff8\017\ufff8\001\002\000" +
    "\010\004\027\006\ufff6\011\ufff6\001\002\000\010\004\027" +
    "\014\047\015\050\001\002\000\004\006\043\001\002\000" +
    "\012\005\023\007\015\012\017\017\021\001\002\000\004" +
    "\013\045\001\002\000\012\005\023\007\015\012\017\017" +
    "\021\001\002\000\006\010\ufff4\013\ufff4\001\002\000\010" +
    "\005\023\007\015\017\021\001\002\000\010\005\023\007" +
    "\015\017\021\001\002\000\006\004\027\006\ufff2\001\002" +
    "\000\006\004\027\006\ufff3\001\002\000\012\005\023\007" +
    "\015\012\017\017\021\001\002\000\004\010\055\001\002" +
    "\000\004\017\ufff9\001\002\000\004\017\ufffc\001\002\000" +
    "\004\005\064\001\002\000\004\002\uffff\001\002\000\006" +
    "\002\ufffd\017\062\001\002\000\004\005\032\001\002\000" +
    "\004\002\ufffe\001\002\000\014\005\023\006\065\007\015" +
    "\016\013\017\021\001\002\000\010\002\ufff7\010\053\017" +
    "\ufff7\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\012\003\005\004\004\011\003\013\007\001" +
    "\001\000\002\001\001\000\010\003\055\005\060\012\057" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\002\021" +
    "\005\015\010\017\015\013\016\023\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\005\015" +
    "\010\040\015\013\017\041\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\005\015\010\024" +
    "\015\013\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\005\015\015\027\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\005\015\010\034\014" +
    "\033\015\013\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\005\015\010\037\015\013\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\002\043\005\015\010\017\015" +
    "\013\016\023\001\001\000\002\001\001\000\014\002\045" +
    "\005\015\010\017\015\013\016\023\001\001\000\002\001" +
    "\001\000\010\005\015\010\051\015\013\001\001\000\010" +
    "\005\015\010\050\015\013\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\002\053\005\015\010\017\015\013" +
    "\016\023\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\060\012\062\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\005\015\010\034\014\033\015\013\001\001" +
    "\000\002\001\001\000\002\001\001" });

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
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("programme",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
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
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_body",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
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
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_calls",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
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
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_calls",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
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
          case 8: // function_decl ::= IDENTIFIER LPAREN RPAREN RBRACKET expr RBRACKET 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int inleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int inright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object in = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT="\tpublic static String "+id+"("+")"+"{\n"+"\t\t"+"return "+in+";"+"\n"+"\t}\n";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_decl",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // function_call ::= IDENTIFIER LPAREN parameters_call RPAREN 
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
          case 10: // function_call ::= IDENTIFIER LPAREN RPAREN 
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
          case 11: // parameters_call ::= parameters_call COMMA statement 
            {
              Object RESULT =null;
		int pcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int pcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object pc = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=pc+","+e;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameters_call",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // parameters_call ::= statement 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=e;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameters_call",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // if_statement ::= IF conditional_statement RPAREN expr ELSE expr 
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
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_statement",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // conditional_statement ::= statement PREFIX statement 
            {
              Object RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object s1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT="("+s1+")"+".startsWith("+s2+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conditional_statement",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // conditional_statement ::= statement SUFFIX statement 
            {
              Object RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object s1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT="("+s1+")"+".endsWith("+s2+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conditional_statement",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= statement 
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
          case 17: // expr ::= if_statement 
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
          case 18: // statement ::= statement PLUS object 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=s+"+"+o;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // statement ::= object 
            {
              Object RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=o;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // statement ::= LPAREN statement RPAREN 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT="("+e+")";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // object ::= IDENTIFIER 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=id;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("object",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // object ::= STRING 
            {
              Object RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int strright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object str = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=str;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("object",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // object ::= function_call 
            {
              Object RESULT =null;
		int fcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object fc = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=fc;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("object",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
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
