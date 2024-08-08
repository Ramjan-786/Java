package non_generic;

public class Tester {

	public static void main(String[] args) {
        //create Holder class instance that can hold int data
		Holder h1 = new Holder(1234);//int convert to Integer (auto boxing)-->up casting : imple done by javac
		int data = (Integer)h1.getRef();//cannot convert from Object to int : add down casting : auto unboxing by javac
		
		//create Holder class instance that can hold String
		Holder h2  = new Holder("hello");//String to Object : up casting
		String s = (String)h2.getRef();//Type mismatch: cannot convert from Object to String : down casting 
		
		h1 = h2;  //h2 obj assing to h1
//here javac does not shoe error but run time classCastException occured cause h1 hold String but can not convert String to Integer 
		data = (Integer)h1.getRef();
		System.out.println(data);
	}

}
