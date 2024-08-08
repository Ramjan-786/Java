package p3;
   
public class Tester1 {

	public static void main(String[] args) {
         //printables : array type of ref var
		//array obj : can contain only i/f type of refs
		Printable[] printables = {new FilePrintable(), new ConsolePrintable()};
		for(Printable p : printables)
			p.print("same message !!!!");
	}

}
