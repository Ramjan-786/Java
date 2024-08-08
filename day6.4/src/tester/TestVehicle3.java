package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle3 { 

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st vehicle details : regNo color price");
        Vehicle v1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
        System.out.println("Enter 2st vehicle details : regNo color price");
        Vehicle v2 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
        System.out.println(v1.equals(v2) ? "Same" : "Different");
        //System.out.println(v1.hashCode() +" " +v2.hashCode());
        String s = new String("Hello");
        //Before handle exception below error get but handle exception by if statement
        System.out.println(v1.equals(s));//java.lang.ClassCastException
        System.out.println(v1.equals(null));//java.lang.NullPointerException
        sc.close();
	}

}
