package p7;

public class BankOfBadoda implements Bank {
//declare constant for min balance
	public static final double MIN_BALANCE;
//what is best recommended way for initialize static member? : static initializer block
	static {
		MIN_BALANCE = 1000;
	}
	
	@Override
	public boolean createAccount(int acctNo, String name, double initBalance) {
		if(initBalance > MIN_BALANCE) {
			System.out.println("Acco created successfully in BOB");
			return true;
		}
		System.out.println("Insufficient opening Balance !!!!");
		return false;
	}

	@Override
	public void withdraw(int acctNo, double amt) {
       System.out.println("withdrawing from BOB a/c");
	}

}
