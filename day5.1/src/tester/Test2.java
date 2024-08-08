package tester;

import Inheritance.Faculty;
import Inheritance.Person;
import Inheritance.Student;

public class Test2 {

	public static void main(String[] args) {
		Object ref = new Student("Rama", "Singh", 2020, "edac", 1234, 56);//indirect referencing
        System.out.println(ref);
		 
		ref = new Faculty("Ramjan", "Patwekar", 34, "java");
		System.out.println(ref);
	}

}
