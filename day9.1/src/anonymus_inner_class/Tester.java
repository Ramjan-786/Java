//Note : Anonymous Inner Class using Interface
//IMP Note : one anonymous cls can not implement multiple i/f so better practice is create another cls and implements multiples i/f

package anonymus_inner_class;

public class Tester {

	public static void main(String[] args) {
			Printable p = new MyPrintable();//up casting
			p.print("My Message");
    //-------------------------------Till here normal way to implement Interface to manually wrote class
			  
			/*-------------------Anonymous Inner Class Syntax-----------------------*/
		//new Printable() : instance of anonymous inner cls which implements Printable Interface
			Printable p2 = new Printable() {     //anonymous class beginning
	//ज्या क्लास चे नाव नाही असे क्लास व येथे इंटरफेस ला implement करायला क्लास नाही लिहावे लागत स्वतः javac "Tester$1.class" असे क्लास बनवतो पहा bin फोल्डर मध्ये			
			
				@Override
				public void print(String mesg) {
					System.out.println("printing from the anonymus inner " +mesg);
				}

				@Override
				public double calc(double d1, double d2) {
					return d1*d2;
				}
				
			};//anonymous inner cls over
			
			//method call
			p2.print("message form anonymus class");
			System.out.println(p2.calc(2, 4));	
	}		
	
//Note:- you can make multiple anonymous Inner cls and rroverride methods 

}
