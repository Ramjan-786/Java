package utils;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

import static com.app.vehicles.Vehicle.sdf;

import java.text.ParseException;
public class ValidatioRules {

	//check for duplicates
//	public static void chkDupVehicle(Vehicle[] vehicleData, int regNo, String color) throws VehicleHandlingException {
//		Vehicle newVehicle = new Vehicle(regNo, color);
//		for(Vehicle oldVehicle : vehicleData) { //vd = vehicleData[0],[1], etc,
//		  if(oldVehicle != null)
//			 if(oldVehicle.equals(newVehicle))
//				throw new VehicleHandlingException("Dup vehicle detected !!!");
//				System.out.println("no duplicate Vehicle .....");
//		}
//	
//	}
	
	public static Vehicle chkDupVehicle(Vehicle[] vehicleData, int regNo, String color, 
			double price, String manufacturingDate) throws VehicleHandlingException, ParseException {
		Vehicle newVehicle = new Vehicle(regNo, color, price, sdf.parse(manufacturingDate) );
		for(Vehicle oldVehicle : vehicleData) { //vd = vehicleData[0],[1], etc,
		  if(oldVehicle != null)
			 if(oldVehicle.equals(newVehicle))
				throw new VehicleHandlingException("Dup vehicle detected !!!");
				}
		System.out.println("no duplicate Vehicle .....");
		return newVehicle;
	}
}
