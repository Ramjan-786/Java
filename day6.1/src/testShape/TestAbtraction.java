package testShape;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestAbtraction {

	public static void main(String[] args) {
      
		BoundedShape[] shape = {new Circle(30, 20, 15), new Rectangle(20,37,55,35)};
      
       for(BoundedShape s : shape) {
    	   System.out.println(s.toString());
    	   System.out.println("Area=" +s.area());
       }
	}

}
