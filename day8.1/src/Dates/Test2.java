package Dates;

//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

/*
 * Add manufacturing Date to Vehicle
 * Accept all the details of vehicle from user and create vehicle instance
 * and display it's details using toString
 * */
public class Test2 {
//JVM not handle exception so use catch block
	public static void main(String[] args) /*throws ParseException*/ {
         try(Scanner sc = new Scanner(System.in);){
        	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//take same date format from user nahitar exce yete
        	 System.out.println("Enter vehicle details regno, color, price, date");
        	 Vehicle v = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));
             System.out.println(v);
         }
         catch (Exception e) {
             e.printStackTrace();
         }
	}

}
