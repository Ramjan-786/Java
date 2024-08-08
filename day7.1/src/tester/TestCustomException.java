package tester;

//static import syntax : fully qualified class name.validatespeed or use * for all 
import static utils.ValidationRules.validateSpeed;
import java.util.Scanner;

//import utils.ValidationRules;

public class TestCustomException {

	public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)) 
         {
        	// Scanner sc = new Scanner(System.in);
        	System.out.println("Enter current speed");
//Note: suppose multiple time different static method call so each time called by class name
//dot method name so here is a one solution use static import       	
        	//ValidationRules.validateSpeed(sc.nextInt());//it is static method so called by class name
        	validateSpeed(sc.nextInt());//here use Static Import
        	System.out.println("end of try");
         }
         catch (Exception e) //Exception e = obj of exception //upcasting
         {    
               //e.printStackTrace();  //here programmer debug code by using this method
              // System.out.println(e);
       	         System.out.println(e.getMessage());  //he method exception class madhe aahe
         }
         System.out.println("main over...");
	}

}
