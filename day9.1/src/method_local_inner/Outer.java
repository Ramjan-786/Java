package method_local_inner;

public class Outer {
//add a method to hold entire class defination
	void test() {
		int data = 100;
		System.out.println("in test...");
			class Inner{
				private int i;
				public Inner(int i) {
					super();
					this.i = i;
				}
				void display() {
					System.out.println("in inner display " +i);
				}
			}//----------------------------------------------------------Inner class end
			
		//display() : can be only accessed from here 
			Inner in = new Inner(11);
			in.display();
	}
	
	void testMe() {
		//you can not call directly inner cls method from outside
		//Call the method that contains the inner class
	//	Inner in = new Inner(11);
	//	in.display();
	}
	
}
