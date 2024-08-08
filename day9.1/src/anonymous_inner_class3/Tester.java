//Note : Anonymous Inner Class using concrete class

package anonymous_inner_class3;

public class Tester {

	public static void main(String[] args) {
		/*-------------------Anonymous Inner Class Syntax-----------------------*/
		
		//new Fruit() => instance of the anonymous inner class which extends Fruit
		//name of anonymous inner cls generated by a javac : Tester$1
		Fruit f1 = new Fruit() {    //anonymous class beginning
		
			@Override
			public void taste() {
				System.out.println("in annonymous inner cls method : Sweet");
			}
			
		};//anonymous inner cls over
		
		//method call
		f1.taste();
	}
	

	

}
