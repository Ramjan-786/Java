package test_static;

public class TestMe {
	//static access only static related data-member, method. 
	public static int counter;
	private int id = 1;
	
	public static void main(String[] args) {
	//	System.out.println(id);  ----- static method cannot access directly static data_member
	 System.out.println("counter=" +counter);// static method access direct static data-member; 
    add(2,3);//you can call static method direct without making object.
	}
	
	private static double add(double d1, double d2){
		//You can not call non-static method or access data_member without object creation.
        TestMe ref = new TestMe();   //crate object for use method & variable.
		ref.multiply(2,3);
		System.out.println(ref.id);
		System.out.println("counter=" +counter);// static method access direct static data-member; 
		return d1 + d2;		
	}
	
	private double multiply(double d1, double d2) {
		//add(6,8);   -- non-static method called directly static method
		//divide(4,2);  -- non-static method called directly non-static method
		// private specifier only access within same class
		System.out.println(this.id);
		System.out.println(id);
		System.out.println("counter=" +counter);//non-static method access direct static data-member; 
		return d1* d2;
	}
	
	private double divide(double d1, double d2) {
		return d1/d2;
	}

}
