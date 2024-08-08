package tester;

import Inheritance.Faculty;
import Inheritance.Person;
import Inheritance.Student;

public class Test3 {

	public static void main(String[] args) {
		//Person[] people =new Person[] this line added by compiler implecitly befor {}.
       Person[] people = {new Student("Rama", "Singh", 2020, "edac", 1234, 56), 
    		   new Faculty("Ramjan", "Patwekar", 34, "java")};//3 obj excluding string on heap
       for(Person p : people) {
    	   System.out.println(p);
       } 
	}

}
