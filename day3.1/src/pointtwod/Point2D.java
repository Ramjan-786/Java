package pointtwod;

import static java.lang.Math.*;

public class Point2D {
private int x, y;

//parameterized constructor to initialize x & y co-ords
public Point2D(int x, int y) {
      this.x = x;
      this.y = y;
}

//return Points Details
public String getDetails() {
	return "point2D Details :" +this.x +" " +this.y;
}	

public void setDetails(int x, int y) {
        this.x = x;
        this.y = y;
}

//check equality of Points
public boolean isEqual(Point2D anotherPoint) {
	return this.x == anotherPoint.x && this.y == anotherPoint.y;
}

//calculate distance between current point and specified point
public double calculateDistance(Point2D anotherPoint) {
	return sqrt(pow(this.x-anotherPoint.x, 2) + pow(this.y-anotherPoint.y, 2));
//	        \/||     |||         |        ||     \/|       |\/            \/
	}

public Point2D createNewPoint2D(int xoff, int yoff) {
      Point2D P3 = new Point2D(this.x + xoff, this.y + yoff); 	
      return P3;
} 

}
