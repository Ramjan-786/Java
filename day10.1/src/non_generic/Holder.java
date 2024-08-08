package non_generic;
//create a non generic class Holder/Box/wrapper which can hold ANY type of data 
public class Holder {
	//state : Object
   private Object ref;//HAS-A     //And it's hold any type of data : Super class

public Holder(Object ref) {
	super();
	this.ref = ref;
}

public Object getRef() {
	return ref;
}
   
   
}
