package Strings;
/*
 * String object are immutable But string reference are mutable(changeable)
 * [ref la value assingn karun] unless declare final(constant) refer line 12.
 * new object banat janar pan jo pahila assing kela aahe toch print honar
 * new print sathi e.g s la te assign karave lagel
 * */
public class Test1 {

	public static void main(String[] args) {
//String is a immutable[no changeable] so no concat "Hello Ramjan" 
//    final String s = "Hello";
	  String s = "hello";
      s.concat("Ramjan");
      System.out.println(s); //s not change
      s= s.concat("Ramjan");//here assign
      System.out.println(s); //now print "Hello Ramjan"
      s+="1234";
      System.out.println(s);
      String s1= s.toUpperCase();
      System.out.println(s);//original value
      System.out.println(s1);//upper case
      String s2 = s.replace('l', 'm');
      System.out.println(s);//original value
      System.out.println(s2);//replace
	}

}
