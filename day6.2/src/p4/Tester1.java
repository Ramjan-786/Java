package p4;
   
public class Tester1 {

	public static void main(String[] args) {
      
		Printable p= new FilePrintable();//up casting
		p.print("Some mesg...");//run time poly (dynamic method dispatch)
		
	  //p.test(); //no test method in Printable i/f

		//down casting
		((FilePrintable)p).test();//no javac err, no run time err
		
		//p = new ConsolePrintable();//up casting
	   //p.test();//no test method in Printable i/f
		//((FilePrintable)p).test();//no javac err, but run time err : classCastException
		
		 if(p instanceof FilePrintable)
			 ((FilePrintable)p).test();
		 else
			 System.out.println("Invalid !!!!");
		 
		 //How to access i/f constants "DATA" ? i/f name.variable_name
		 System.out.println(Printable.DATA);
	}

}
