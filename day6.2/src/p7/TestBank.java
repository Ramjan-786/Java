package p7;

import java.util.Scanner;

/*   Ithe ase logic aahe ki, eka veli ekch user acco create karnar.
 * Allow user 1. to choose only a single bank
 * Once user choose the bank , anothe option : 2 withdraw funds 
 * 3.pay Bills  
 * 4.Exit
 * */
public class TestBank {
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		boolean AccoCreated= false;
		BankOfBadoda b = null;
		HDFC h = null;
		while(!exit) {
		System.out.println("1.create a/c in BOB 2.create a/c in HDFC 3.deposite"
				+ "4.Withdraw 5.Pay Bills 10.Exit");
		switch (sc.nextInt()) {
		case 1://BOB a/c create
			if(AccoCreated == false) {
			BankOfBadoda bob = new BankOfBadoda();
			b = bob; //for invoke different methods
			System.out.println("Enter a/c No, Name, Balance");
		AccoCreated = bob.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());  //function call
		  //AccoCreate d = true;
			} else {
				System.out.println("You have already account");
			}
			break;
			
		case 2://HDFC a/c create
			if(AccoCreated == false) {
			HDFC hc = new HDFC();
			h = hc; //for invoke different methods
			System.out.println("Enter a/c No, Name, Balance");
			AccoCreated = hc.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());
			//AccoCreated = true;
			} else {
				System.out.println("You have already account");
			}
			break;
			
		case 3:
			
			break;
			
		case 4://withdraw
//			 System.out.println("Put bank Name for withdraw money like : 1.BOB  2.HDFC");
//			 System.out.println("1. BOB  2.HDFC");
//			 if(sc.next() == "BOB")
	         if(b != null) {
	         System.out.println("Enter a/c No, amount");
			b.withdraw(sc.nextInt(), sc.nextDouble());
	         }
	         else if(h != null) {
		         System.out.println("Enter a/c No, amount");
				 h.withdraw(sc.nextInt(), sc.nextDouble());
	         } 
	         else {
	        	 System.out.println("You don't have any A/C");
	         } 
			break;
			
		case 5://payBills
			System.out.println("This service only availbale for HDFC bank");
			if(h != null)
			h.payBills();
			else
				System.out.println("You dont't have any a/c in HDFC for this service use");
			break;
			
		case 10:
			exit = true;
			break;
			


		}	
		}
         
	}

}
