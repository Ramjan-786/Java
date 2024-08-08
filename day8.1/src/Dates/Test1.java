package Dates;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);//current date
		Date d2 = new Date(0);
		System.out.println(d2);//epoch : date 1st Jan 1970
		System.out.println(d1.before(d2));//false
		System.out.println(d1.after(d2));//true
		System.out.println(d1.compareTo(d2));//+1
		
	}

}
