package tester;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
         Scanner sc = null;
         try{
        	 sc = new Scanner(System.in);
        	 System.out.println("Enter integer");
        	 System.out.println("you entered :" +sc.nextInt());
        	 System.out.println("end of try");
         }
         catch (Exception e) {
            System.out.println("err " +e);
         }
         finally {
        	 System.out.println("closing scanner");
        	 sc.close(); //resources closing inside the finally block
         }
         System.out.println("main over....");
	}

} //for resources Automatically close use "try with resources" syntax against "finally" block 
