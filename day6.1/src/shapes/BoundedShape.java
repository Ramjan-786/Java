package shapes;

public abstract class BoundedShape {
   private int x;
   private int y;
   
   public BoundedShape(int x, int y) {
         this.x  = x;
         this.y = y;
   }

@Override
public String toString() {
	return "[x=" + x + ", y=" + y + "]";
}

//area() : abstract
public abstract double area();  //abstract method
   
   
}
