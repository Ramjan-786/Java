package generic;
//NOTE : Do comparison between non generic and generic so you understand difference and Use case
public class Tester {

	public static void main(String[] args) {
        //create generic Holder class instance that can hold int data
		//diamond operator (added JDK 1.7) => type of RHS is same from type of LHS
		Holder<Integer> h1 = new Holder<>(1234);//int ---> Integer(auto boxing)
		int data = h1.getRef();//Integer--> int (auto un boxing) : impl done by javac
//Note : but in package generic : Holder class hardcore define state is a Object so getRef() 
//return object convert object to Integer by downcasting [compare kara non generic aani  generic folder madhi example] 	
		
		//create generic Holder class instance that can hold String
		Holder<String> h2 = new Holder<>("hello");//no imple conversion
		String s  = h2.getRef();//no down casting required
		
	//	 h1 = h2; //Type mismatch: cannot convert from Holder<String> to Holder<Integer> : error caught @compile time
	}

}
