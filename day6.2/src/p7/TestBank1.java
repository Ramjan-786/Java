package p7;

import java.util.Scanner;

/*   Ithe ase logic aahe ki, eka veli ekch user acco create karnar.
 * Allow user 1. to choose only a single bank
 * Once user choose the bank , anothe option : 2 withdraw funds 
 * 3.pay Bills  
 * 4.Exit
 * */
public class TestBank1 {
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Bank ref = null;
		while(!exit) {
		System.out.println("1.create a/c in BOB 2.create a/c in HDFC 3.deposite"
				+ "4.Withdraw 5.Pay Bills 10.Exit");
		switch (sc.nextInt()) {
		case 1://BOB a/c create
			if(ref == null) {
			ref = new BankOfBadoda();
			System.out.println("Enter a/c No, Name, Balance");
		ref.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());  //function call
			} else {
				System.out.println("You have already account");
			}
			break;
			
		case 2://HDFC a/c create
			if(ref == null) {
			ref = new HDFC();
			System.out.println("Enter a/c No, Name, Balance");
		ref.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());  //function call
			} else {
				System.out.println("You have already account");
			}
			break;
			
		case 3:
			
			break;
			
		case 4://withdraw
             if(ref != null) {
            	 System.out.println("Enter a/c No and amt to withdraw !!!");
             ref.withdraw(sc.nextInt(), sc.nextDouble());
             }else {
            	 System.out.println("You have not yet chosen a bank !!!!");
             }
			break;
			
		case 5://payBills
			if(ref != null) {
				if(ref instanceof HDFC) {
			       ((HDFC)ref).payBills();
				}else {
					System.out.println("this bank not support payBills service !!!!");
				}
			}else {
				System.out.println("You dont't have any a/c in HDFC for this service use");
			}
				break;
			
		case 10:
			exit = true;
			break;
			


		}	
		}
         
	}

}
