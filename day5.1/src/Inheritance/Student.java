package Inheritance;

public class Student extends Person{
     private int gardeYear;
     private String courseName;
     private double fees;
     private int marks;
     
     public Student(String fn,String ln,int gardeYear,String courseName,double fees,int marks)
     { 
    	// no any statement add before super because is 1 execute
    	 super(fn, ln); //Programmer must call matching super class constructor
    	 System.out.println("I am in students's constructor");
    	 this.gardeYear = gardeYear;
    	 this.courseName = courseName;
    	 this.fees = fees;
    	 this.marks = marks;
     }
     //overriding method : i.e same method declaration, modified the definition.
     @Override
     public String toString() {
    	 return "Student" +" " +super.toString() +" " +"gradeYear" +" " +gardeYear +" " 
     +"courseName" +" " +courseName +" " +"fees" +" " +fees +" " +"marks" +" "+marks;	
     }
     
     //add new functionality
     public void study() {   //implicitly add super near to get method 
    	 System.out.println(getFirstName() +" " + "studying in course" +" "+courseName);
     }
}
