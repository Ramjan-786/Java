package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle2 { 

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st vehicle details : regNo color price");
        Object v1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());//up casting
        System.out.println("Enter 2st vehicle details : regNo color price");
        Object v2 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());//up casting
        System.out.println(v1.equals(v2) ? "Same" : "Different");
        //System.out.println(v1.hashCode() +" " +v2.hashCode());
        sc.close();
	}

}
