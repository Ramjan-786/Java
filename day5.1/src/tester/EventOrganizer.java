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
		+"3.display particient details" +" "  +"4.Invoke study/teach" +" "+"10.Exit");			
		       System.out.println("Choose Option");
		       switch (sc.nextInt()) {
		case 1:
		  if(counter < participent.length) {
		  System.out.println("Enter your details : FirstName, lastName, gardeYear, courseName, fees, marks");
		  participent[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
		     //up casting(Student ---> Is-A Person)
		  }
		  else System.out.println("Seats are full");
		  
		  break;

		case 2:
			if(counter < participent.length) {
			System.out.println("Enter your details : FirstName, lastName, expInYears, sme");
			participent[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
			}
			  else System.out.println("Seats are full");
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
         
        case 4:
        	System.out.println("Enter the seat no:");
        	int index = sc.nextInt()-1;
            if(index >= 0 && index < counter) {
            	Person p = participent[index];
            	if(p!=null) {
            	   //P.study(); //compiler check study() not exits in Person
            	  //((Student)p).study();//down_casting but it is hardcore
        //In Array p refer to student object no error occured during compile time 
        //and run time becasue study() exits in Student class.
        // But p refer Faculty obj no error occured during compile time but at run time error occured java.lang.ClassCastException 
        // becasue study() not exits in Faculty class.  
            		if(p instanceof Student) //(RTTI)run time type info [Run time information check]
            			((Student)p).study();//down casting
            		else if(p instanceof Faculty)
            			((Faculty)p).teach();//down casting
            	}
            }		
        	break;
         
        case 10:
	         exit = true;
	    break;
			}
		}
	}

}
