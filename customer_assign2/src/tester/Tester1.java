package tester;

import static utils.ValidationRules1.*;

import java.util.Arrays;
import java.util.Scanner;

import com.app.core.Customer;
import static com.app.core.CustomerCategory.*;

import custom_Exception.CustomerHandlingException;

public class Tester1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter customer capacity :");
           Customer[] customers = new Customer[sc.nextInt()];
           boolean exit = false;
           int counter =0;
           while(!exit) {
        	   System.out.println("Options: "+"1.Register Customer" +" " +"2.Link Adhar Card" +" " +"3.Display services"
                       +" " +"4.change plan" +" " +"5.Display all customers" +" " +"10.Exit");
        	   try {
        	   switch (sc.nextInt()) {
			case 1://Register Customer
				System.out.println("Alert : after succesfully registeration you want to activate your plan by linking Adhar card");
				if(counter<customers.length){//chk array capacity
				double amount = 0;
				System.out.println("Enter Coustomer : name, email, password, registrationAmount, dob[dd-MM-yyyy], CustomerCategory");
				Customer c1 = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
						amount = sc.nextDouble(), converDate(sc.next()), validateCategory(amount,sc.next()));
				customers[counter++]=c1;//here each register customer added into customer Array
				}else {
				     throw new CustomerHandlingException("Registration limit is over !!!");
				}
				     break;
				
			case 2://Link Adhar Card
				System.out.println("Enter email to link your adhar card");//e-mail id is unique/primary key
				//invoke a method to check if customer with specified email exits
				Customer c2 =findCustomerByEmail(sc.next(),customers);//success : customer found on email
				System.out.println("Enter adharCard no and creationDate(dd-MM-yyyy)");
				c2.linkAdharCard(sc.next(), sc.next());
				break;

			case 3 ://Display services
				System.out.println("Display all services related plan with prices ");
				System.out.println(Arrays.toString(values()));
				break;
				
			case 4 ://change plan
				System.out.println("Alert : Without registration you can't change plan");
				System.out.println("Please confirm once again by Yes or NO ");
				if (sc.next().equals("yes")){
				System.out.println("Enter email to change plan");
				c2 =findCustomerByEmail(sc.next(),customers);
				System.out.println("old category : "+c2.getCategory());
				System.out.println("Enter new paln : ");
				c2.setCategory(valueOf(sc.next().toUpperCase()));
				System.out.println("New category : "+c2.getCategory());				
				}else {
					System.out.println("Your plan is not change !!!!");
				}
				break;

			case 5://Display all customers
				for(Customer c:customers)
					if(c!=null)
						System.out.println(c);//c.toString()
				break; 
				
			case 10://Exit
                exit = true;
				break;
			}//switch case end
           }
           
           catch (Exception e) {
                e.printStackTrace();
            }
        	   //read off all data from scanner till end of line
        	   sc.nextLine();//user put input but in between wrong input added & error come then remaining value present in buffer
        	                 //of Scanner so without taking next input from user, he will take remaining input from buffer storage
           
		}//while end
           
	}//try with resources end        
		catch (Exception e) {
           e.printStackTrace();
		}
	}//main end	

}//class end
