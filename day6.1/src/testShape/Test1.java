package testShape;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class Test1 {

	public static void main(String[] args) {
		 //can you create instance of abstract class : NO
		//BoundedShape shape = new BoundedShape();
        //Can you use abstract super cls ref --> concrete sub cls instance : Yes
		BoundedShape shape = new Circle(10, 20, 10.3);//up casting
		System.out.println(shape.area());//JVM : type obj : Circle
	    shape = new Rectangle(10, 20, 30, 40);//up casting
	    System.out.println(shape.area());//JVM : type obj : Rectangle
	    
	    //final
	    final BoundedShape s = new Circle(29, 45, 2.3);
	  //  s=new Circle(20, 25, 8.3); //The final local variable s cannot be assigned. 
	}

}
