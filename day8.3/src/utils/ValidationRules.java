package utils;

import java.text.ParseException;
import com.app.core.Customer;
import custom_Exception.CustomerHandlingException;
import static com.app.core.Customer.sdf;

public class ValidationRules {

	public static boolean validateEmail(String email) {
	//email must contain "@" and should be from ".com" domain
		return email.contains("@") && email.contains(".com");
	}
	
	public static boolean validatePassword(String password) {
	 //password must be min 4 max 10 chars longs  
		return password.length() >= 4 && password.length() <= 10;
	}
	
	public static Customer customerValidate(String name, String email, 
			String password, double regAmt, String dob) throws CustomerHandlingException, ParseException{
		Customer c = null;
		if(validateEmail(email)) {
             if(validatePassword(password)) {
            	 c = new Customer(name, email, password, regAmt, sdf.parse(dob));            	 
             }
             else
            	 throw new CustomerHandlingException("password must be min 4 max 10 chars longs");
		}
		else {
			throw new CustomerHandlingException("email must contain \"@\" and should be from \".com\" domain");
		}
		
		return c;
	}
}
