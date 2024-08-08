package tester;

import java.util.ArrayList;
import java.util.Scanner;
import static com.app.core.Department.*;
import static com.app.core.Emp.sdf;

import com.app.core.Emp;

public class Tester1 {

	public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
    	   //1.create empty arrayList to store Emp info.
    	   ArrayList<Emp> empList = new ArrayList<>();//size=0, capa=10
    	   //2.Accept Emp details from user and store in ArrayList          
    	   System.out.println("Enter emp's details : id, name, salary, deptId, joinDate(day-mon-year)");
    	   empList.add(new Emp(sc.nextInt(),sc.next(),sc.nextDouble(),valueOf(sc.next().toUpperCase()),sdf.parse(sc.next())));
    	   //ArrayList : toString()                                     //String to Enum convert
    	   System.out.println("Emp list contents " +empList);
    	   /*3.fetch emp details from AL i/p: emp id o/p : in case of sucess : display
    	    *emp details or not throw custom exception
    	    *1st part : if emp id is valid : "present" or "absent" 
    	    * */
    	   System.out.println("Enter emp id");//emp search by id in arrayList
    	   //contain method internally call equal method of emp (jar emp madhe nasel tar objects class chi equal() call) : refer array related  
    	   //logic with for each loop : for understanding
    	   Emp e = new Emp(sc.nextInt());
    	   System.out.println(empList.contains(e)?"Present":"Absent");
          
       
       }
		catch (Exception e) {
            e.printStackTrace();
		}
	}

}
