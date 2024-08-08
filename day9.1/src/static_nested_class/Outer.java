package static_nested_class;

public class Outer {
	//data member of outer cls
	private int i;
	private static int j;
	//contr of outer cls
	public Outer(int i) {
		super();
		this.i = i;
	}
	//non static method of outer cls
	void show() {
		//Outer cls can't access directly NestedClass non static member so create Instance of nestwedClass
		NestedClass c = new NestedClass(12);
		System.out.println("can access " +i +" " +j +" " +c.k +" " +NestedClass.l);
	}
	//static method of outer cls
	static void display() {
		Outer o = new Outer(33);
		NestedClass c = new NestedClass(12);
		System.out.println("can access "+o.i +" " +j +" " +c.k +" " +NestedClass.l);
	}
	
	//static nested cls 
	static class NestedClass{
		//data member of nestedCls cls
		private int k;
		private static int l;
		//ctr of nestedcls
		public NestedClass(int k) {
			super();
			this.k = k;
		}
		
		//static initializer block
		static {
			j = 1234;
		}
		
		//non static method of NestedCls
		void testMe() {
	//		System.out.println("can access " +i);//javac error
		    System.out.println("can access " +j +" " +k +" " +l);
		}
		
		//static method of NestedCls
		static void testMeAgain() {
			System.out.println("can access " +j +" " +l);	
		}
	}
}
 