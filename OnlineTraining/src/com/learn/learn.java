package com.learn;

import java.util.Scanner;



/*
public class learn {

	public static void printName(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {

	printName("Ramjan");
	}
}
*/
//public class learn
//{
//    public static void main(String args[])
//    {
//        System.out.println("Welcome all");
//    }
//}

public class learn{
	public static void main(String[] args) {
		//System.out.println("Hello From the ramjan");
	/*
		char ch = 'A';
		System.out.println(ch);//A
		System.out.println('A');//A
		System.out.println('a');//a
		System.out.println((int)'a');//95
		System.out.println((int)ch);//65
	*/
		/*
			int x = 100;
			System.out.printf("Printing simple integer: x = %d\n", x);        //Printing simple integer: x = 100                                  
			// this will print it upto 2 decimal places
			System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);//Formatted with precision: PI = 3.14
			float n = 5.2f;
			// automatically appends zero to the rightmost part of decimal
			System.out.printf("Formatted to specific width: n = %.4f\n", n);    //Formatted to specific width: n = 5.2000
			n = 2324435.3f;
			// here number is formatted from right margin and occupies a
			// width of 20 characters
			System.out.printf("Formatted to right margin: n = %20.4f\n", n);    //Formatted to right margin: n = 2324435.2500
	  */
	
	/*
		int num1, num2, num3, res;
		//num1 =args[0];//Type mismatch: cannot convert from String to int
		//num2 =args[1];//Type mismatch: cannot convert from String to int
	//How to convert String to int so use---->parseInt()
	//value cmd madhe ghala---->Use Run-->Run Configration
	num1 = Integer.parseInt(args[0]);
	num2 = Integer.parseInt(args[1]);
	num3 = Integer.parseInt(args[2]);
	res = num1 + num2 + num3;
	
	System.out.println("Num1 Value = "+num1);
	System.out.println("Num2 Value = "+num2);
	System.out.println("Num3 Value = "+num3);
	System.out.println("Result = "+res);
  */

 /*
	int num = 55;
	System.out.printf("Num = %d", num);                           //Num = 55
 	System.out.printf("\n Num =%20d", num);                       //Num =                  55  
	 
	float fval = 5.4f;
	System.out.printf("\n F value = %f", fval );                  //F value = 5.400000
	System.out.printf("\n F value = %.3f", fval);                // F value = 5.400
	System.out.printf("\n F value = %9.2f", fval);              // F value =      5.40
	
	System.out.printf("\n PI = %f",Math.PI );                  // PI = 3.141593
	System.out.printf("\n PI = %.2f",Math.PI );                 // PI = 3.14
	
	System.out.printf("\n Num = %-20d fval = %.3f", num, fval); // Num = 55                   fval = 5.400
	
*/	
	/*	
    int n1, n2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First No :");
    n1=sc.nextInt();//1
    System.out.println("Enter Second No :");
    n2=sc.nextInt();//2	
	
	System.out.println("First = " +n1+"Second =" +n2);//First = 1, Second =2
	*/
	
	/*
		int i; float f; double d;
		i = Integer.parseInt(args[0]);
        f = Float.parseFloat(args[1]);				
		d = Double.parseDouble(args[2]);
		System.out.println("I = "+i+" Fval = "+f+" D = "+d);
	*/	
	/*
		//-------SWITCH CASE with DO-WHILE LOOP---------//
		 int n1, n2, ch;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter First No :");
		    n1=sc.nextInt();
		    System.out.println("Enter Second No :");
		    n2=sc.nextInt();		
		do {
			System.out.println(" Enter Choice : 0.Exit, 1.Add, 2.Sub, 3.Mul, 4.Div, 5.Mod ");
	 	ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Add =" +(n1+n2));
			break;
			
		case 2:
			System.out.println("Sub =" +(n1-n2));
			break;
			
		case 3:
			System.out.println("Mul =" +(n1*n2));
			break;
			
		case 4:
			System.out.println("Div =" +(n1/n2));
			break;
			
		case 5:
			System.out.println("Mod =" +(n1%n2));
			break;
			
		case 0:
			System.out.println("Sorry Try Next Time");
			break;
		}
		
	}while(ch!=0);
*/	
		/*
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character Value :");
		ch=sc.next().charAt(0);// Akshita String 
		                       // charAt(0) A 
		
		if(ch>=65 && ch<=90)  
			System.out.println("Upper case Letter");
		else  
			if(ch>=97 && ch<=122) 
			System.out.println("Lower case Letter");	
			else
				if(ch>=48 && ch<=57)
					System.out.println("Digit");
				else
					System.out.println("Special Symbol");
			*/
		/*
			
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		str = sc.next();
		System.out.println("Hello " +str);
		sc.close();
      */	
	
		   
	}
	
}

/* O/P Range Yenar
class TestPrimTypeRange {
    public static void main(String[] args) {
        System.out.println("Byte Range " + Byte.MIN_VALUE + ":" + Byte.MAX_VALUE);
        System.out.println("Long Range " + Long.MIN_VALUE + ":" + Long.MAX_VALUE);
        System.out.println("Float Range " + Float.MIN_VALUE + ":" + Float.MAX_VALUE);
        System.out.println("Double Range " + Double.MIN_VALUE + ":" + Double.MAX_VALUE);
  }
}
*/
/*
 //Here Type cast--->Narrowing & Widening
  public class TestConversions {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        b1 += b2;// b1 =(byte) (b1+b2);
        short s1 = 1234;
        // short s2=b1+s1;//javac err
        long l1 = 12345678;// int ---> long
        float f1 = l1;// long ---> float
        long l2 = (long) f1;// no javac err : after explicit narrowing conversion
        char ch = 'A';
        ch = 65;
        // boolean flag = 1;// incompatible types !!!!
        double d1 = f1;// float ---> double
        d1 = 1234.56F;// float ---> double
       //  float f2 = 2456.67;// double ---X--->float(error)

    }
}
*/
 
/*  Access Specifire---->Same Package 
package p1;

public class A {
private int i;
int j;
protected int k;
public int l;

public A() {
	System.out.println("A state "+i +j +k +l);
}//ALL Write
}
*/
/*
package p1;

public class B extends A {
B(){
	System.out.println("B state "+i +j +k +l);
}//Error in i
}
*/
/*
package p1;

public class C {
C(){
	A a1 = new A();
	System.out.println("C state "+a1.i +a1.j +a1.k +a1.l);
}//Error in i
}
*/

/*
Package p2;

import p1.A;

public class D extends A{
	D(){
		//super();//invoking immediate super cls'c ctor
		System.out.println("D's state "+i+" "+j+" "+k+" "+l);
	}//ERROR IN i , j
   }
*/

/*
 package p2;
import p1.A;

class E {
	E() {
		A a1=new A();
		System.out.println("A's state "+a1.i+" "+a1.j+" "+a1.k+" "+a1.l);
	}//Error in i, j, k
   }//.....Here Access Specifire is END.....
 */


