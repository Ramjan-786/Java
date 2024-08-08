package custom_exception;

public class VehicleHandlingException extends Exception{
	//Parameterized construction
     public VehicleHandlingException(String mesg) {
    	 super(mesg);
     }
}
