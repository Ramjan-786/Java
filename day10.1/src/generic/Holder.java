package generic;

//generic not allowed primitive type
//create a "generic" class Holder/Box/wrapper which can hold T type of referance
public class Holder <T>{  //T is a place holder
	//state : T
   private T ref;//HAS-A     //And it's hold any type of data : Super class

public Holder(T ref) {
	super();
	this.ref = ref;
}

public T getRef() {
	return ref;
}
   
   
}
