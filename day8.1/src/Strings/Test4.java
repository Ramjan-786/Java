package Strings;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		String s = "hi there user !!!!, welcome user";
	
		System.out.println("char at 3rd index " +s.charAt(3));//t
		//System.out.println(s.charAt(s.length()));//java.lang.StringIndexOutOfBoundsException
		System.out.println(s.charAt(0) +" " +s.charAt(s.length()-1));//h r
		
		//chek if string containing "user" word or any data you want
		System.out.println(s.contains("USER"));//case sensitive //false
		System.out.println(s.contains("user"));//true
		
		System.out.println("index of 1st occurrence of \"user\"" +" "+s.indexOf("user") +" " 
				             +"last index" +" " +s.lastIndexOf("user"));//position of index in int
		
		//comparison : compareTo
		String s1= "Anish";
		String s2 = "Anushka";
		String s3 = "Priya";
		String s4 = "Amit";
	   System.out.println(s1.compareTo(s2)); //-ve
	   System.out.println(s1.compareTo(s3));//-ve
	   System.out.println(s1.compareTo(s4));//-ve
	   
	   //String class API : public String[] split (String regex)
         String s5 = "one,two,three,four,five";
         //display these CSV's [comma seperated values ]
        //System.out.println(Arrays.toString(s5.split(",")));//[one, two, three, four, five]
         String[] tokens = s5.split(",");
	     System.out.println(Arrays.toString(tokens));
	     
	     char[] ch = {'R','A','M','J','A','N'};//dynamic initialize of array
         System.out.println(String.valueOf(ch, 3, 3));//JAN :  return string
        System.out.println("-------------------------"); 
         String l = "ramjan";
     	System.out.println(l.length());
	}


}
