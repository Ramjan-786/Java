package p7;

public interface Bank {
	//public abstract internally added by javac
   boolean createAccount(int acctNo, String name, double initBalance);
   
   void withdraw(int acctNo, double amt);
}
