package day1;

public class StringDemo1 {

	public static void main(String[] args) {
         String str ="Ramjan";
         System.out.println("Befor revers : " +str);
         char[] ch = str.toCharArray();
         String rev="";
         for(int i= ch.length-1; i>=0; i--) {
        	 rev = rev + ch[i];
         }
         System.out.println("After revers : " +rev);
	}

}
