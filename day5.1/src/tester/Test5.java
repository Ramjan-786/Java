package tester;

import Inheritance.Faculty;
import Inheritance.Person;
import Inheritance.Student;

public class Test5 {

	public static void main(String[] args) {
		Person ref = new Student("Rama", "Singh", 2020, "edac", 1234, 56);//indirect referencing
        System.out.println(ref);//ref.toString();
        
        ((Student)ref).study();
        //down casting : compiler does not implicitly conversion
        
       	ref = new Faculty("Ramjan", "Patwekar", 34, "java");
		System.out.println(ref);//ref.toString();
		
		((Faculty)ref).teach();
		//down casting : compiler does not implicitly conversion
		
		//compiler not throw error because study is exit in student like make compiler fool.
		//But run time JVM see ref refer to faculty object so study() not exits
		((Student)ref).study(); // exception JVM throw : classCastException (Faculty is not Student)
		
	}

}
