package p4;

public class ConsolePrintable implements Printable{
	
	//if abstract method in interface and If you don't know how to implements 
	//then make a class abstract cls see below e.g.
	//public abstract class ConsolePrintable implements Printable {......}

	
	//Cannot reduce the visibility of the inherited method from Printable
	//@Override
	//void print(String message) {}   javac error
	
	@Override
	public void print(String message) {
		System.out.println("Printing a message on Console " +message);
		
		//access data : imple class can DIRECTLY access i/f constants 
		System.out.println(DATA);
	}
	
	
}
