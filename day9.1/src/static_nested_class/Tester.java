package static_nested_class;

import static_nested_class.Outer.NestedClass;

public class Tester {

	public static void main(String[] args) {
        Outer o = new Outer(12);
        o.show();
		Outer.display();
		NestedClass.testMeAgain();
		Outer.NestedClass n = new Outer.NestedClass(12);
		n.testMe();
		
	}

}


