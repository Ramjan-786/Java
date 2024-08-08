package utils;

import custom_exception.SpeedOutOfRangeException;

public class ValidationRules {
    //add constants for speed boundaries
	public static final int MIN_SPEED;
    public static final int MAX_SPEED;
    
    static {
    	MIN_SPEED = 40;
    	MAX_SPEED = 80;
    }
 //NOTE:- SpeedOutOfRangeException class madhe hi exce. extends zali Exception class madhun tar ti checked exce aahe so use throws keyword
 //Tyala extends RUNTIMEException class madhun extends kele aste tar complie time error aala nasta pan ti try catch ne handle karavi lagel   
    //add static method for validate speed of a vehical
    public static void validateSpeed(int speed) throws SpeedOutOfRangeException
    {
    	if(speed < MIN_SPEED)
    		//its programmer custom exception throw
    		throw new SpeedOutOfRangeException("You are driving to slow !!!!");
        if(speed > MAX_SPEED)
        	throw new SpeedOutOfRangeException("You are driving to fast, FATAL");
        System.out.println("Speed within range !!!!");
    }
}
