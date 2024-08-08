package arrays;

import java.util.Arrays;

public class Test2DArray {

	public static void main(String[] args) {

//		System.out.println(this);  ---	Cannot use "this" keyword in a static context
		
  //2D Array
	 double[][] data = new double[3][4];//how many objs. on heap - 4 
	 System.out.println(data.getClass().getName());
	 int value = 1;
	   for(int i=0; i<data.length; i++) 
         for(int j =0; j<data[i].length; j++)//data[0].length=4
        	 data[i][j]= value++;  //data[0][0]=1;
	   
	   //display the array vale by for loop
	   for(int i=0; i<data.length; i++) 
	      for(int j =0; j<data[i].length; j++)
	      System.out.print(data[i][j] +" ");
	   
	      System.out.println();
	   //Display array data with predefined API from Doc
	   System.out.println("Display array data with Arrays class method is deepToString");
	   System.out.println(Arrays.deepToString(data));
	   
	 //3D Array
//	   int[][][] a = new int[2][3][4];
//		 System.out.println(a.getClass().getName());

	   
	    //Dynamic init of 2D array
	   //int[][] data = {{1,2,3,4},{2,3,4,5},{3,4,5,6}}
	   //System.out.println(Arrays.deepToString(data));
	}

}
