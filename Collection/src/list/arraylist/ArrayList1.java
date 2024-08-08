package list.arraylist;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
   //Iterating ArrayList using Iterator  OR Print array in different way
   List<Integer> no = new ArrayList<>();
   no.add(5); no.add(6); no.add(8);
   //Way : 1
   System.out.println("Print number through toString()" +" " +no);
   //Way : 2
   //Traversing list through Iterator  
   Iterator itr = no.iterator();//getting the Iterator 
   System.out.print("Print number through Iterator : ");
	   while(itr.hasNext()) {//check if iterator has the elements 
		   System.out.print(itr.next() +" ");//printing the element and move to next  
	   }
     System.out.println();
   //Way : 3
     for(Integer i : no){
    	System.out.println(i);
     }
    //Way : 4
    //Traversing list through Iterator  
     System.out.println("Print number through ListIterator : ");
  ListIterator<Integer> Litr= no.listIterator(no.size()); 
  //Traversing elements in backward direction
     while(Litr.hasPrevious()) {//check if List-iterator has the elements
         System.out.println(Litr.previous()); //printing the element and move to backward 	 
     }
     /*-----------------------------------------------------------------------------------------*/
		//create array
        String[] array = {"Java", "Spring", "Spring boot", "ORM"};
        System.out.println(Arrays.toString(array));
        /*convert Array to ArrayList*/
        //create ArrayList
        List<String> list1 = new ArrayList<>();
        for(String s : array) {
              list1.add(s);	
        }
        System.out.println(list1);
        //old ArrayList copy into new ArrayList
        List<String> list2 = new ArrayList<>();
        for(String s : list1) {
        
        	list2.add(s);
        }
         System.out.println(list2);       
    /*-----------------------------------------------------------------------------------------*/
	       /*convert ArrayList to Array*/
	   List<String> l = new ArrayList<>();
	    l.add("Mango");
	    l.add("Apple");
	    l.add("Grapes");
	    System.out.print("List of fruits" +" "+l +" " );
	    System.out.println();
	    //It is First way
	    String[] s1 = new String[l.size()];
	    for(int i=0; i<s1.length; i++){
	    	s1[i]=l.get(i);//Here add data from list to array
	    }
	    System.out.print("Array of fruits" +" "+Arrays.toString(s1));
	    System.out.println();
	    
	    //It is second way
	    String[] s2 = l.toArray(new String[l.size()]);
	    System.out.print("Array of fruits" +" "+Arrays.toString(s2));
 /*-----------------------------------------------------------------------------------------*/

	
	  }
}
