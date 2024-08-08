package tester;
//Note: compare Array to ArrayList : No required counter,boundary chk, null chk, 

import static com.app.core.Department.valueOf;
import static com.app.core.Emp.sdf;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Emp;

import custom_Exception.EmphandlingException;

public class EmpManagment {

	public static void main(String[] args) {
       
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<Emp> emps = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("Options: 1.Add Emp Details 2.Display All Emp details 3.Get Specified emp details"
						+"10. Exit");
				try {
					switch (sc.nextInt()) {
					case 1://add emp by uniqe Id
						System.out.println("Enter Id");
						int id = sc.nextInt();
						if(emps.contains(new Emp(id)))
							throw new EmphandlingException("Emp exits by this Id, Please put uniqe Id");
						System.out.println("Enter emp's details : name, salary, deptId, joinDate(day-mon-year)");
						//AL API : add
				    	   emps.add(new Emp(id,sc.next(),sc.nextDouble(),valueOf(sc.next().toUpperCase()),sdf.parse(sc.next())));
				    	   break;
					case 2:
						//no null chk 0 to size-1 [size : list madhe obj kiti aahe]
                        System.out.println("Emps Details: ");
                        for(Emp e : emps)
                        	System.out.println(e);
						break;
					case 3:
						System.out.println("Enter emp id, to fetch details");
						int index = emps.indexOf(new Emp(sc.nextInt()));
						if(index == -1)
							throw new EmphandlingException("Invalid Emp id : Emp not found");
						System.out.println("Emp details " +emps.get(index));
						break;

					case 10:
						exit = true;
						break;
					}
				}//end try of switch
				catch (Exception e) {
					e.printStackTrace();
				}
				//clear off pending inputs from scanner
				sc.nextLine();/*switch case madhe kahi error aale v buffer madhe inputs 
				pending astil v pudhe te user kadun inputs n gheta te buffer madhun 
				ghenar v excp yenar "InputMismatch"*/
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
