package testpointtwod;

import java.util.Scanner;
import pointtwod.Point2D;

public class TestPoint2DFunctions {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first point details");
        Point2D P1 = new Point2D(sc.nextInt(), sc.nextInt());
        
        System.out.println("Enter second point details");
        Point2D P2 = new Point2D(sc.nextInt(), sc.nextInt());
        
        //(p1's details & p2's details)
        System.out.println("First points Details :" +P1.getDetails());
        System.out.println("Second points Details :" +P2.getDetails());
        
        //isEqual Points
        System.out.println(P1.isEqual(P2) ? "Same" : "Different");
        
        //calculateDistance
        System.out.println("Distance between two points : " +P1.calculateDistance(P2));
        
        //Create new object with offset
        System.out.println("Enter x and y offset for creating Point2D");
        Point2D P3 = P1.createNewPoint2D(sc.nextInt(), sc.nextInt());
        System.out.println("First points Details :" +P1.getDetails());
        System.out.println("Third points Details :" +P3.getDetails());
        
        sc.close();
	}

}
