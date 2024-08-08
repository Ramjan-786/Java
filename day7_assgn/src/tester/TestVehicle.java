package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle { 

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st vehicle details : regNo color price");
        Vehicle v1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
        System.out.println("Enter 2st vehicle details : regNo color price");
        Vehicle v2 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
        System.out.println(v1.equals(v2) ? "Same" : "Different");
       
        sc.close();
	}

}
