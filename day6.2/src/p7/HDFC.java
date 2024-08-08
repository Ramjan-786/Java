package p7;

public class HDFC implements Bank {
//declare constant for min balance
	public static final double MIN_BALANCE;
//what is best recommended way for initialize static member? : static initializer block
	static {
		MIN_BALANCE = 5000;
	}
	
	@Override
	public boolean createAccount(int acctNo, String name, double initBalance) {
		if(initBalance > MIN_BALANCE) {
			System.out.println("Acco created successfully in HDFC");
			return true;
		}
		System.out.println("Insufficient opening Balance !!!!");
		return false;
	}

	@Override
	public void withdraw(int acctNo, double amt) {
       System.out.println("withdrawing from HDFC a/c");
	}

	//can HDFC provide additional services? Yes
	public void payBills() {
		System.out.println("Paying bills using HDFC a/c");
	}
}
