package tester;
//close() method implemented from Autocloseable i/f to classes ref java doc. 
import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){   //try with resources syntax
        	System.out.println("Enter full name");
        	System.out.println("Hello, " +sc.nextLine());
        }//end of try block Automatically close() method call for Scanner by JVM 
        catch (Exception e) {
           e.printStackTrace();
       }
	}

}
