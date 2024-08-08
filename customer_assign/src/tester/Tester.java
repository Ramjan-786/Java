package tester;

import static utils.ValidationRules1.*;

import java.util.Scanner;

import com.app.core.Customer;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter Coustomer : name, email, password, registrationAmount, dob[dd-MM-yyyy], CustomerCategory");
			// before instance creation validation done.
			Customer c = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
					validateRegAmount(sc.nextDouble()), converDate(sc.next()), validateCategory(sc.next()));
			// validation rule : success
			System.out.println(c);//c.toString()
		} catch (Exception e) {
			e.printStackTrace();
			//e.getMessage();
		}

	}

}
