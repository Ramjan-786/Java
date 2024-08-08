package com.learn;

public class xyz {
	
	private int a;
	private String name;
	private double price;
	private static int no;
   public static void main(String[] args) {
	   //static method access static member
	   no = 5;
	   System.out.println(no);
	   //static method can not access non-static member
	   //name = "Ramjan";
       //System.out.println(name);
	   testMeStatic();//static method call only static method
	   xyz x = new xyz();
	   x.testMeNonStatic();//static method can not directly call non-static method
   }
   
   public static void testMeStatic() {
	   no = 6;
	   System.out.println(no);
   }
   
   public void test() {
	   
   }
   public void testMeNonStatic() {
	   //non static method direct access non static member and method without create object
	      name = "Ramjan";
	      System.out.println(name);
	      System.out.println(price);
	      test();
	    //non static method direct access static member and method without create object    
	      no =7;
	      System.out.println(no);
	      testMeStatic();
   }
}
