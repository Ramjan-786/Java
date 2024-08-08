package tester;

public class Testinheritance1 {

	public static void main(String[] args) {
	    C c1 = new C();
	}
  }
	//Extend keyword showing IS-A relationship between two classes
	class A{//extend object
	      A(){
	    	  super();
	    	  System.out.println("1");
	      }
	}
	
	class B extends A{
	      B(){
	    	  super();// java compiler implicitly add super for invoke super class constructor
	    	  System.out.println("2");
	      }
	}
	
	class C extends B{
	      C(){
	    	  super();// java compiler implicitly add super for invoke super class constructor
	    	  System.out.println("3");
	      }
	}
	


