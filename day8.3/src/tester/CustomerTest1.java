package tester;

import java.util.Scanner;

import com.app.core.Customer;

import static utils.ValidationRules.customerValidate;

public class CustomerTest1 {

	public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
        	System.out.println("Enter Coustomer : name, email, password, registrationAmount, dob[dd-MM-yyyy]");
         Customer c  =  customerValidate(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next());
         System.out.println(c);
        }
        catch (Exception e) {
             e.printStackTrace();
        }
        
	}
}
