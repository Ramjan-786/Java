package arrays;

import java.util.Arrays;
import java.util.Scanner;
import com.sunbeam.core.Box;

public class TestDynInitArray {

	public static void main(String[] args) {
		//dynamic initialize array of primitive type
		//int[] data = new int[]{}; ---- implicitly compiler added.
      int[] data = {1,2,3,4,5};
      System.out.println(Arrays.toString(data));
      System.out.println("Name of the loaded class into method area =" +data.getClass().getName());
      Scanner sc = new Scanner(System.in);
      System.out.println("Loded class for scanner = " +sc.getClass().getName());

      //dynamic initialize array of reference type
      //Box[] boxes = new Box[]{};  --- implicitly compiler added.
       Box[] boxes = {new Box(10,20,30), new Box(4,5,6), new Box(7,8,9)};
       //Heap var 4 object create honar 1 for array index and remaining 3 for box object
//       for(int i=0; i<boxes.length; i++) {
//    	   System.out.println(boxes[i].getBoxDimensions());
//       }
       
 //[Note : for-each ne array elememt or index modify karta yete nehi pan object che state karu shakto ]
       //Update width when each object volunme is grater than 100.
        for(Box b : boxes) {
        	 System.out.println("Before Width ="+b.getBoxDimensions()); 
             if(b.getBoxVolume() > 100) 	 
            	 b.updateWidth(sc.nextDouble());
             System.out.println("Width is change =" + b.getBoxDimensions());
        }
       
}

}


