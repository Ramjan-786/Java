package non_static_nested_class;
// how to invoke non static method of the non static Inner class ?


public class Test1 {

	public static void main(String[] args) {
    //Inner in = new Inner(10); 	//error : Inner can not exist without outer means u can not create Inner class instance without creating Outer class instance 	
	Outer outer = new Outer(10);//Outer cls ref ---> Outer cls instance
	Outer.Inner inner = outer.new Inner(11);//inner cls ref --> inner cls instance enclosed
	//within the outer cls instance 
	//invoking outer's non static method
	outer.display();
	//static method 
    Outer.show();	
// how to invoke non static method of the non static Inner class ?
       inner.innerShow();
	}

}
