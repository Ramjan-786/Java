package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TestPrimitiveArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		double[] data = new double[sc.nextInt()];
		
		 for(int i=0; i<data.length; i++) {
			 System.out.println("Enter double value for array");
			 data[i]=sc.nextDouble();
		    }
		
			
	    System.out.println("Array values :");
	    for(int i=0; i<data.length; i++) {
	    	System.out.print(data[i] +" ");
	    }
	    
	    System.out.println();
          //API- public static String toString(double[] arr)--> Using from java.util.Arrays
	    System.out.println(Arrays.toString(data));	
	    System.out.println(data.getClass().getName());
	    byte[][] Byte = new byte[1][2];
	    System.out.println(Byte.getClass().getName());
	
	}

}
