package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

import static utils.ValidatioRules.chkDupVehicle;

public class Showroom { 

	public static void main(String[] args) {
	
      try(Scanner sc = new Scanner(System.in)){
    	  System.out.println("Enter showroom size");
    		Vehicle[] newVelAdd = new Vehicle[sc.nextInt()];  
    	    int index = 0;
    		boolean exit = false;   
    		
    		while(!exit){
    			System.out.println("Choose the below option :");
    			System.out.println("1. Add Vehicle" +" " +"2. All Vehicles Details" +" " +"10. Exit");
    		try {
    			switch (sc.nextInt()) {
//				case 1:
//					if(index < newVelAdd.length) {
//						System.out.println("Enter RegNo, color, price");
//						Vehicle v = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
//						//Tester has to invoke method of validationRule : static
//						chkDupVehicle(newVelAdd, v.getRegistrationNo(), v.getColor());
//						//After not duplicate found vehicle details added into array
//						newVelAdd[index++]=v;
//						System.out.println("Vehicle details added...");
//					}
//					else {
//						//System.out.println("Vehicle adding capacity are full ....");
//       //Note:-Koni sangitale throw ekach place la use karave but remember 
//	        //one thing throw use karat asal tar exception yenar tar try catch block ne handle kara 
//					    throw new VehicleHandlingException("Showroom full !!!");
//					}
//					break;
				case 1:  //Above you we can make two time make object on same data but here write code in better maanner
					if(index < newVelAdd.length) {
						System.out.println("Enter RegNo, color, price");
						//Tester has to invoke method of validationRule : static
				Vehicle v = chkDupVehicle(newVelAdd, sc.nextInt(), sc.next(), sc.nextDouble());
						//After not duplicate found vehicle details added into array
						newVelAdd[index++]=v;
						System.out.println("Vehicle details added...");
					}
					else {
					    throw new VehicleHandlingException("Showroom full !!!");
					}
					break;
				case 2:
					System.out.println("Showroom Details !!!");
					for(Vehicle v : newVelAdd) {
						if(v != null)
						System.out.println(v.toString());
					}
					break;
				case 10:
					exit = true;
					break;
				
				}
    		}catch (Exception e) {
    			//e.printStackTrace();
    			System.out.println(e);
    			//System.out.println(e.getMessage());
			}
    	}
	}


}

}