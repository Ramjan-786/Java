package utils;

import java.text.ParseException;
import java.util.Date;

import custom_Exception.CustomerHandlingException;
import static com.app.core.Customer.sdf;

public class ValidationRules1 {
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;
	public static Date thresholdDate;
	
	static{
		MIN_LENGTH = 4;
		MAX_LENGTH = 10;
	   try {
		thresholdDate = sdf.parse("1-1-1995");
	} catch (ParseException e) {
		System.out.println("err in static init block "+e);
	}
	}
	//add a static method to validate Email
 public static String validateEmail(String em) throws CustomerHandlingException{
	 if(em.contains("@") && em.endsWith(".com"))
		 return em;//return validate email to the caller 
	 throw new CustomerHandlingException("Invalid email formate!!!");
 }
 
 //add a static method to vlidate password
 public static String validatePassword(String password) throws CustomerHandlingException{
	 if(password.length()< MIN_LENGTH || password.length() > MAX_LENGTH)
	 throw new CustomerHandlingException("Invalid password length!!!");
	 return password;//if cond false zali ki password return karaychi aahe	 
 }
 
 //add static method for validating register amount
 //reg Amount should be multiples of 500
 public static double validateRegAmount(double amount) throws CustomerHandlingException{
 	 if(amount % 500 != 0)
		 throw new CustomerHandlingException("Invalid Reg Amount");
	 return amount;
 }
 
 //add a static method to convert String -----> Date
 //dob should be before 1st Jan 1995
 public static Date converDate(String dob) throws ParseException, CustomerHandlingException{
	 Date d1 =  sdf.parse(dob);//conversion
	 //date conversion success
	 if(d1.after(thresholdDate))
		 throw new CustomerHandlingException("Invalid date !!!");
	 //date validation success
	 return d1;//return  parsed and validated Date to the caller
 } 
}












