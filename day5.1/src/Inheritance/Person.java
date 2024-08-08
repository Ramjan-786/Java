package Inheritance;

public class Person {
	//tight encapsulation
   private String firstName;
   private String lastName;
   
// public Person() {   
// }
   
   public Person(String firstName, String lastName) {
	   //super();
	   System.out.println("I am in persons's contructor");
	   this.firstName = firstName;
	   this.lastName = lastName;
   }
   //Note: when you comment parent class toString() by default object class toString() call.
   //overriding method : i.e same method declaration, modified the definition.
   @Override
 public String toString() {
	  return firstName + " " +lastName;
 }
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
   
   
 
   
   
   
}
