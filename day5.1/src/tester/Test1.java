package tester;

import Inheritance.Faculty;
import Inheritance.Person;
import Inheritance.Student;

public class Test1 {

	public static void main(String[] args) {
//super cls ref, super cls obj, sub cls ref, sub cls obj
//sub cls ref --> sub cls obj (direct referencing): type of the ref & type of the boj is same
		Student s1 = new Student("Rama", "Singh", 2020, "edac", 1234, 56);
//Javac resolve the  method binding by the type of the	reference & JVM resolve the  method binding by the type of the object it's referring to
		System.out.println(s1);//s1.toString() //javac check if toString() exits in Student class : Yes compiles ok
		//JVM : late binding---> late binding -->will be call don Student obj.
		 Person p;
	//super cls ref ---> sub cls obj  //indirect referencing
		 p=s1; //up casting Student ---> Person : Done implicitly by javac. [similar to widening]
		System.out.println(p);//p.toString()
		 //compile time person toString() binding but run time JVM override method [invoke student toString()]
		 Faculty f1 = new Faculty("Ramjan", "Patwekar", 34, "java");
		 System.out.println(f1);
		 p = f1;
		 System.out.println(p);
		 
		//Type mismatch: cannot convert from Faculty to Student
		// double d = "sj";
		//Student s = new Faculty("Ramjan", "Patwekar", 34, "java");
		
	}

}
