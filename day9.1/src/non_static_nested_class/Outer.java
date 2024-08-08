package non_static_nested_class;
/*
 * static method can not overriding
 * static method can overloading[change the signature]
 * static method can overloading with non static method
 * */
public class Outer {
    private int i; //object state & create ones per object
    private static int j;//no state of obj & create ones per class
 
    static {
    	j=100;
    }
    //Outer constructor
    public Outer(int i) {
    	super();
    	this.i = i;
    }
    
    //static method of the Outer class
    public static void show() {
    	System.out.println("Outer's j" +j);//static method only access static method and member
    	//static method can not create directly instance of Inner non static cls so use Outer.inner
    	//Inner obj is tightly couple to outer cls so first create Outer cls Instance in static method of Outer cls
    	Outer.Inner in = new Outer(11).new Inner(12);
    	System.out.println("Inner data members " +in.k +" " +Inner.l);
    	Outer o = new Outer(12);
    	System.out.println("Outer data members " +o.i +" " +j);
    }
    
    //non static method
    public void display() {
    	System.out.println("Outer non static method" +i +" " +j);
    	//non static method access directly static & non static methods and members
    
    	//Outer cls can't access directly data members of Inner cls so we need to create Instance of Inner cls
    	Inner in = new Inner(12);
    	System.out.println("inner data members " +in.k +" " +Inner.l);
    }
    
  //nested class : class declared within outer class -- non static nested class
    class Inner{   //use any 4 access specifier for inner class
    	private int k;
    //	private static int l;//error: u can not use only static keyword
    	private static final int l = 1234;
    //	static {      //error : Cannot define static initializer in inner type Outer.Inner
    //		l=1234;
    //	}
    	//Add constructor for initialize inner class data member
    	public Inner(int k) {
    		this.k = k;
    	}
    	/*
    	//static method 
    	static void test() { also u can not use static method within non static Inner class
    	The method test cannot be declared static; static methods can only be declared in a static or top level type	 
    	}
    	*/
    	//non static method
    	public void innerShow() {
    		//Access all data member of inner and outer class
    		System.out.println("inners detail's " +k +" " +l);
    		System.out.println("outer private member's " +i +" " +j);
    	/*
    	 * Note:- inner class access directly data member of outer class
    	 * but outer cls can not access directly data member of inner cls	
    	 */
    
    	}
    }
    
}
