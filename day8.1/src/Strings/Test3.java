package Strings;
/*
 *  refer dia. By JVM String literal/constant pool create on heap area & inside this 
 *  ref create & pointing to literal object along with your own STACK ref.
 *   use for sharing the same resources
 */
public class Test3 {

	public static void main(String[] args) {
            String s1 = "hello";//literal
            String s2 = new String(s1);//non-literal
            String s3 = "hello";//literal
            String s4 = "Hello";//literal
            
	    System.out.println(s1==s2);//false : check on ref
	    System.out.println(s1.equals(s2));//true : check on content
	    System.out.println(s1==s3);//true : hold same obj refer mam diagram
	    System.out.println(s1.equals(s3));//true
	    System.out.println(s1==s4);//false
	    System.out.println(s1.equals(s4));//false : case sensetive
	    System.out.println(s1.equalsIgnoreCase(s4));//true
	}

}
