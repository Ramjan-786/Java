package tester;
//make emp class abstract 
import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter employee capacity");
	   //Here is not make a abstract class obj it's a array obj. so no error
       //emp:It is a array type ref refering to array obj, which can hold employee type of ref.
       Employee[] emps = new Employee[sc.nextInt()];
	   
	   boolean exit = false;
	   int counter = 0;
	   
	   while(!exit){
             System.out.println("Choose the below options for hiring:");
             System.out.println("1. Hire Manager" +" " +"2. Hire Worker" +" "
             +"3. Employee datails with Net Salary and performanceBonus/hourlyRate" +" " +"10. Exit");
             
	switch (sc.nextInt()) {
	   case 1:
		   if(counter < emps.length) {
			System.out.println("Enter Manager Details: id, name, deptId, basic, performanceBonus");
		    emps[counter++] = new Manager(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
		   }
		   else 
		    	System.out.println("Hiring Capacity Is Full !!!!!!");
		  
		    break;

	   case 2:
		   if(counter < emps.length) {
			System.out.println("Enter Manager Details: id, name, deptId, basic, hoursWorked, hourlyRate");
		    emps[counter++] = new Worker(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextInt());
		   }
		   else 
		    	System.out.println("Hiring Capacity Is Full !!!!!!");
		  
		    break;
			
	   case 3:
		    for(Employee e : emps) {
		    	if(e!=null) {
		    	System.out.println(e.toString());
		    System.out.println(e.computeNetSalary());
		    if(e instanceof Manager) {
		    System.out.println(((Manager)e).getPerformanceBonus());
		    }
		    else {
		    	System.out.println(((Worker)e).getHourlyRate());
		    }
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
