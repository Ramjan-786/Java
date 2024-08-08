package Inheritance;

public class Faculty extends Person {
      private int expInYears;
      private String sme;
      
	public Faculty(String FirstName, String LastName, int expInYears, String sme) {
		super(FirstName, LastName);
		System.out.println("I am in faculty's constructor");
		this.expInYears = expInYears;
		this.sme = sme;
	}
       //overriding method : i.e same method declaration, modified the definition.
	@Override
      public String toString() {
    	  return "Faculty" +" " +super.toString() +" " +"expInYears" +" " +expInYears
                           +" " +"sme" +" " +sme;
       }
	
	//add new functionality
	public void teach() {
		System.out.println(getLastName() +" " +"teaching in" +" " +sme);
	}
}
