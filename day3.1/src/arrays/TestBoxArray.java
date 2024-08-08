package arrays;

import java.util.Scanner;
import com.sunbeam.core.Box;
import java.util.Arrays;

public class TestBoxArray {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		//crate box array size
        System.out.println("Enter Box array size :");
        Box[] b = new Box[sc.nextInt()];
        
        //Insert Box Dims.
        for(int i=0; i<b.length; i++) {
        	 System.out.println("Enter Box Dims :");
        	b[i]= new Box(sc.nextDouble(), sc.nextDouble(),sc.nextDouble());	
        }
        
        //get each Box Details from array
        for(int i=0; i<b.length; i++) {
                System.out.println(b[i].getBoxDimensions());
	    }
        
        //b = null;  total 6 object= 1 + 5boxes d-references;
        
        //Update Box at perticular number
        System.out.println("Enter the index no. between 0 to Box array size for update Box details :");
        int t = sc.nextInt();
        System.out.println("Enter Box details :");
        // b[sc.nextInt()].updateBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
          b[t].updateBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        		
        for(int i=0; i<b.length; i++) {
            System.out.println(b[i].getBoxDimensions());
            //get Volume
            System.out.println("Volume :" +b[i].getBoxVolume());
        }
        
        
//        System.out.println();
//    
//	    System.out.println(Arrays.toString(b));

}
	
}
