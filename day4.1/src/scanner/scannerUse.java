package scanner;

import java.util.Scanner;

public class scannerUse {

	 // static method call only static method directly without creating object
//	public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter two no. for addition");
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             sum(a, b);
//	}
//	
//	public static void sum(int a , int b) {
//		int sum = a + b;
//		System.out.println("Sum =" +sum);
//	}
	
	//static method call non-static method with creating object
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two no. for addition");
//           int a = sc.nextInt();
//           int b = sc.nextInt();
//           scannerUse su = new scannerUse();    //creating object of current class
//           su.sum(a, b);
//	}d
//	public void sum(int a , int b) {
//	int sum = a + b;
//	System.out.println("Sum =" +sum);
//}

	//create scanner one time and use many time by "pass by value" 
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      sum(sc);
}

public static void sum(Scanner sc) {
	  System.out.println("Enter two no. for addition");
	     int a = sc.nextInt();
	     int b = sc.nextInt();
           int sum = a + b;
        System.out.println("Sum =" +sum);
}
	
}
