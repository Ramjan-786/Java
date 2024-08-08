package p4;

public class FilePrintable implements Printable{
	
	@Override
	public void print(String message) {
		System.out.println("Storing a message in file :" +message);
	}

	 //Can you specify additional behavior here? : Yes
	 public void test() {
		 System.out.println("in test...");
	 }
}
