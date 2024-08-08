package tester;
//[Super extends to sub classes]--->Obj--> Throwable ---> Exception ---> RunTimeExcs --> remaining 
import java.util.Scanner;

public class TestUnCheckedException {

	public static void main(String[] args) {
		try {
          int[] data = {1,2,3,4,5,6};
  //javac does not force handling of the unchecked excs( extends from java.lang.RunTimeException)
          // System.out.println(data[6]);
          System.out.println(data[5]);
          System.out.println("end of try");
          String s = "dc1234";
          System.out.println("Parsed integer " +Integer.parseInt(s));//java.lang.NumberFormatException
          Scanner sc = null;
          System.out.println(sc.nextInt());//NullPointerException
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e ) {
			System.out.println("in multi catch" +e);//e.toString()
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("error1");
//		}
//		catch(NumberFormatException e) {
//			System.out.println("error2");
//		}
		catch (Exception e) {
         //    System.out.println("in catch-all");
			e.printStackTrace();   //this method from Throwable class
		}
          System.out.println("main cont...args");
	}

}
