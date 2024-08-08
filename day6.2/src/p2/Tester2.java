package p2;
            ////In-Direct referancing
public class Tester2 {

	public static void main(String[] args) {
      Printable p; //interface type of ref
      //can interface ref directly refer to implement cls intance : Yes
      p = new ConsolePrintable();//up casting
      
      p.print("new message !!!!");//javac chek by type of ref : chek if print() exits in Printable interface : Yes
      //no error. JVM resolve : by type of object: print : ConsolePrinter : run time poly
      
      p = new FilePrintable();//up casting
      p.print("Another message !!!");
	}

}
