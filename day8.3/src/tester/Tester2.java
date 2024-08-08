package tester;

import static utils.ValidationRules1.*;

import java.util.Scanner;

import com.app.core.Customer;

public class Tester2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter Coustomer : name, email, password, registrationAmount, dob[dd-MM-yyyy]");
			// before instance creation validation done.
			Customer c = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
					validateRegAmount(sc.nextDouble()), converDate(sc.next()));
			// validation rule : success
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
