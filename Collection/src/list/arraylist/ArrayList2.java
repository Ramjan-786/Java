//Use : get,set,size, remove, clear, retainAll, isEmpty sort method

package list.arraylist;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
   ArrayList<String> al = new ArrayList<>();
	al.add("HDFC"); al.add("BOI"); al.add("BOB"); al.add("SBI"); al.add("BNP"); al.add("BOA");//indexing start from 0
	//fetch list before update
	System.out.println(al);
    //Use : size method : Returns the number of elements in this list.
	System.out.println("total element store into List :" +" "+al.size());
	//Use : get method : fetch specific element from list
	System.out.println(al.get(1));
	//set method used
	System.out.println("it is replaced" +" " +al.set(3, "ICICI"));//set method : update element at specific index
	System.out.println(al);
	//Use : remove method : 
	al.remove("HDFC"); System.out.println("Remove by object : " +al);
	al.remove(0); System.out.println("Remove by index :  " +al);
	al.removeAll(al); System.out.println("Remove all collection : " +al);
	al.clear(); System.out.println("Removing all the elements available in the list" +al);
	System.out.println("Check list is empty or not : " +al.isEmpty());
    /*-----------------------------------------------------------------------------------------*/
	   //Use : sort method from Collections class
     List<Integer> i = new ArrayList<>();
     i.add(6); i.add(4); i.add(9); i.add(7);
     System.out.println("List before sorting " +i);
     Collections.sort(i);
     System.out.println("List after sorting " +i);
     /*-----------------------------------------------------------------------------------------*/

     
	}
}
