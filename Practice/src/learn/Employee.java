package learn;

import java.util.Scanner;
/*
public class Employee {
	private int empid;
	private int salary;
	Scanner sc = new Scanner(System.in);
	public void accept() {
		System.out.println("Enter Emp id :");
		empid = sc.nextInt();
		System.out.println("Enter Salary id :");
        salary  = sc.nextInt();
    }
	public void disp() {
		System.out.println("EmpID ="+empid+"Salary ="+salary);
	}
	
}
*/
public class Employee
{
	private int empid; // DATA MEMBER
	private int salary; // DATA MEMBER 
	private String name;// DATA MEMBER 
	Scanner sc=new Scanner(System.in);
	public void accept() // MEMBER FUNCTION
	{
		System.out.println("Enter Emp ID :");
		empid=sc.nextInt();
		System.out.println("Enter Salary : ");
		salary=sc.nextInt();
		System.out.println("Enter Name : ");
		name=sc.next();
		
	}
	public void disp() // MEMBER FUNCTION
	{
		System.out.println("EmpID = "+empid+" Salary ="+salary+" Name = "+name);
	}
	
}