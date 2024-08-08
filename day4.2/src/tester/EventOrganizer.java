package tester;

import java.util.Scanner;

import Inheritance.Faculty;
import Inheritance.Person;
import Inheritance.Student;
//Arrange an event to invite Student and Faculty
public class EventOrganizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter event capacity");
		//Create suitable data structure to hold the participant details 
		Person[] participent =new Person[sc.nextInt()];
	    boolean exit = false;
	    int counter = 0;  //event seats or index
		while(!exit){
               System.out.println("1.Stutent register" +" " +"2.Faculty register" +" "
		   +"3.display particient details" +" "  +"5.cancel registration" +" " +"10.Exit");			
		       System.out.println("Choose Option");
		       switch (sc.nextInt()) {
		case 1:
		  if(counter < participent.length) {
		  System.out.println("Enter your details : FirstName, lastName, gardeYear, courseName, fees, marks");
		  participent[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
		}
//		  else System.out.println("Seats are full");
		  else {
			  System.out.println("As per our records seats are full but i will check any for empty seats ");
			  for(int i=0; i<participent.length; i++) {
				  
				  if(participent[i] == null) {
					  System.out.println("You are lucky seat are available for booking");
		System.out.println("Enter your details : FirstName, lastName, gardeYear, courseName, fees, marks");
		participent[i] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());  
		  System.out.println("Seat are successfully rregister!!!!");		
		break;
			 	  }
				  else if(i<participent.length) {
					  
					 continue; 
				  }
			  }
			  System.out.println("You are not lucky! Seats are full. Please! try next Time");
		 }
		  
		  break;

		case 2:
//			if(counter < participent.length) {
//			System.out.println("Enter your details : FirstName, lastName, expInYears, sme");
//			participent[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
//			}
//			  else System.out.println("Seats are full");
//	    break;
			if(counter < participent.length) {
			System.out.println("Enter your details : FirstName, lastName, expInYears, sme");
			participent[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
			}
			  else {
				  System.out.println("As per our records seats are full but i will check any for empty seats ");
				  for(int i=0; i<participent.length; i++) {
					  
					  if(participent[i] == null) {
			 System.out.println("You are lucky seat are available for booking");
			System.out.println("Enter your details : FirstName, lastName, gardeYear, courseName, fees, marks");
			participent[i] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());  
			  System.out.println("Seat are successfully rregister!!!!");		
			break;
				 	  }
					  else if(i<participent.length) {
						  
						 continue; 
					  }
				  }
				  System.out.println("You are not lucky! Seats are full. Please! try next Time");
			 }
			  
			  break;
				
        case 3:
//            	for(int i=0; i<participent.length; i++) {
//                        if(participent[i] != null)
//                   System.out.println(participent[i].toString());
//            	}
            	System.out.println("--------------------------------------------");
            	for(Person p : participent) {   //p=participent[0],........  
            		if(p!=null)
            	   System.out.println(p.toString());
            	}
            	
         break;
         
//    	case 4:
//    		System.out.println("Choose seat you want between 0 to 99");
//    		int seat = sc.nextInt();
//    		  if(counter < participent.length) {
//    		  System.out.println("Enter your details : FirstName, lastName, gardeYear, courseName, fees, marks");
//    		  participent[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
//    		}
//    		  else System.out.println("Seats are full");
//    	break;
         
        case 5 :
        	   System.out.println("Put your seat no.");
        	   int i = sc.nextInt();
        	   if(i < participent.length) {
        		  if(participent[i] != null) {
        			  participent[i]=null;
        			  System.out.println("Succesfully Registration canceled");
        		  }
        		  else System.out.println("This seat no." +" " +i +"is not booking so how you can cancel registration" );
        	   }	   
        	   else System.out.println("Right seat no. puts in range");
        		   
        	break;
        	
        case 6 :
        	
        

        case 10:
	         exit = true;
	    break;
			}
		}
	}

}
