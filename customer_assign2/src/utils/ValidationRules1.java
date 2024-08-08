package utils;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.CustomerCategory;
//10,11 use when you can call method without Enum/Class name
//import static com.app.core.CustomerCategory.valueOf;
//import static com.app.core.CustomerCategory.values;

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
// public static double validateRegAmount(double amount) throws CustomerHandlingException{
// 	 if(amount % 500 != 0)
//		 throw new CustomerHandlingException("Invalid Reg Amount");
//	 return amount;
// }
 
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
 
 //Add a static method to validate category along with reg amount
 public static CustomerCategory validateCategory(double amount,String category) throws CustomerHandlingException {
	 try {
		 //convert category String---> Enum
		 CustomerCategory chosenCategory = CustomerCategory.valueOf(category.toUpperCase());
		 //category valid --- chk if user is paying required amount ---yes--- return category
		 if(amount != chosenCategory.getCharges())
			 throw new CustomerHandlingException("Invalid amt paid for the choosen plan, Pay" +" " +chosenCategory.getCharges());
	 //javac : public static CustomerCategory valueOf(String name) throws IllegalArgumentsException : it's a unchecked Exce
	 return chosenCategory;//CC Enum method valueOf(String name) : Check ENUM is present and convert String to Enum
	 }
	 catch(IllegalArgumentException e){
		 //here try to write different logic aani inBuilt Exce throw n karta custom exce throw keli aahe  
		 StringBuilder sb = new StringBuilder("Invalid category chosen \n");//StringBuilder is mutable : modify
         sb.append("Valid Category : \n");
         sb.append(Arrays.toString(CustomerCategory.values()));
//String append to sb   //convert array to String  //all Enum array got 
        // System.out.println(sb);
         throw new CustomerHandlingException(sb.toString());
	 } 
	}
 
      //add a static method to find customer details by email
 		public static Customer findCustomerByEmail(String email,Customer[] cust) throws CustomerHandlingException{
 			//task done by customer equals method
 			//create customer instance by wrapping email(uniquq id)
 			Customer c1 = new Customer(email);
 			for(Customer c : cust)
 				if(c!=null && c.equals(c1))
 					return c;
 			throw new CustomerHandlingException("Customer not found : Invalid email id !!!");
 		}
}












