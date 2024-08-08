package value_passing;

import java.util.Arrays;

public class TestValuePassing {
//....FROM Here All Different Type Testing......// 
	/*
	public static void main(String[] args) {
	Emp e1 = new Emp(1, "Rj", 1000);
	System.out.println("Original Sal Before =" +e1.getSal());//1000
	
	TestValuePassing t1 = new TestValuePassing();
	t1.testMe(e1.getSal(), 100);//Fun Call
	System.out.println("In Main, After Updation :" +e1.getSal());//1000
	}

	public void testMe(double sal, double income) {
		sal = sal + income;
		System.out.println("In This Method Sal =" +sal);//1000+100=1100
	}
*/
	/*
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Rj", 1000); 
	System.out.println("Original Sal Before =" +e1.getSal());//1000
	//Methos Static aahe so don't creat obj.
	testMe(e1, 100);  //ref. pass(means)--->obj pass + pri.val.
	System.out.println("In Main, After Updation :" +e1.getSal());//1100
	//Karan eka obj la don ref. aahet so value change second time line no.27
	}
	
	public static void testMe(Emp e, double inc) {
		e.setSal(e.getSal() + inc );//1000+100=1100
		System.out.println("In This Method Sal =" +e.getSal());//1100
	}
	*/
	/*
	public static void main(String[] args) {
		Emp e1=new Emp(1,"aa",1000);//e1 = 1000
		Emp e2=new Emp(2,"ab",2000);//e2 = 2000
		System.out.println("Original Sal Before =" +e1.getSal()+""+e2.getSal());
		//1000, 2000
		swap(e1, e2);//fun call-->ref. pass(means)--->obj pass
		System.out.println(" sal after swap ="+e1.getSal() +"  "+e2.getSal());
		}//1000, 2000---->swap kelyanantar sudha value same
     
        public static void swap(Emp e3, Emp e4) {//e3=e1 , e4=e2
        	Emp tmp = e3;
        	e3 = e4;
        	e4 = tmp;
        	System.out.println("in method after  swap= "+e3.getSal() +"  "+e4.getSal());
        }//2000, 1000
    */
	
	/*
	public static void main(String[] args) {
		int[] myData = { 1, 2, 3, 4, 5 };
	//	int[] newData= doubleIt(myData);

		System.out.println("Orig data - " + Arrays.toString(myData));
		//Orig data - [1, 2, 3, 4, 5]
		myData= doubleIt(myData);//Fun call
		System.out.println("New data - " + Arrays.toString(myData));
	// New data - [2, 4, 6, 8, 10, 0, 0, 0, 0, 0]
	}
	static int[] doubleIt(int[] ints) {
		int[] tmp = new int[ints.length * 2];
		for (int i = 0; i < ints.length; i++) {
			tmp[i] = ints[i] * 2;
		}
		return tmp;
	}
*/
  }
