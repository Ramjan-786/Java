package p3;

public class FilePrintable implements Printable{
	
	@Override
	public void print(String message) {
		System.out.println("Storing a message in file :" +message);
	}

}
