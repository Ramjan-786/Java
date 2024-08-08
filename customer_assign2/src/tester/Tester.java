package tester;

import static utils.ValidationRules1.*;

import java.util.Scanner;

import com.app.core.Customer;


public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			double amount = 0;
			System.out.println("Enter Coustomer : name, email, password, registrationAmount, dob[dd-MM-yyyy], CustomerCategory");
			// before instance creation validation done.
//			Customer c = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
//					validateRegAmount(sc.nextDouble()), converDate(sc.next()), validateCategory(sc.next()));
			
			Customer c = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
					amount = sc.nextDouble(), converDate(sc.next()), validateCategory(amount,sc.next()));
			
			// validation rule : success
			//prompt user for Adhar details
			System.out.println("Enter adharCard no and creationDate(dd-MM-yyyy)");
			c.linkAdharCard(sc.next(), sc.next());
			System.out.println(c);//c.toString()

		} catch (Exception e) {
			e.printStackTrace();
			//e.getMessage();
		}

	}

}
