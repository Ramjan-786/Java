package tester;

import Inheritance.Faculty;
import Inheritance.Student;

public class Testinheritance2 {

	public static void main(String[] args) {
		//create student object
	 Student s1 = new Student("Ramjan", "Patwekar",2022, "edac", 2000, 98);
      //On heap 3 string and 1 student object created
	 
	 //java.lang.Object class method : public String toString(){}
	//getClass().getName() + @ + hashCode() =>fully qualified className @ object address
	 //System.out.println(s1.toString());//Inheritance.Student@39ed3c8d Before add overidden method
	 //System.out.println(s1) // implicitly call s1.toString() or any ref: Why-> [ref java doc] println mathod call internally.
	 System.out.println(s1.toString());
	 
	 Faculty f1 = new Faculty("Azim", "Patwekar", 12, "java,mysql");
	 //System.out.println(f1.toString());//Inheritance.Faculty@123772c4 Before add overidden method
	 System.out.println(f1.toString());
	 
	
	}

}
