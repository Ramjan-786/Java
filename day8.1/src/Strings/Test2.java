package Strings;
/*
 *  == vs equals vs equalIgnoreCase
 *  //for understanding of string class operation refer vehicle class equal method
 */
public class Test2 {

	public static void main(String[] args) {
     String s1 = new String("hello"); //RHS : non literal   //direct hello assign is called literal
	 String s2 = new String("Hello");
	 String s3 = new String("hello");
	 
	 System.out.println(s1==s2);//false : ref equality
	 System.out.println(s1.equals(s2));//false : case sensitive content equality 
	 System.out.println(s1.equalsIgnoreCase(s2));//true : case insensitive content equality 
	 System.out.println(s1==s3);//false
	 System.out.println(s1.equals(s3));//true
	}

}
