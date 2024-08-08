package sets.Interface.sortedSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		/*Java TreeSet class contains unique elements only like HashSet.
		  Java TreeSet class access and retrieval times are quiet fast.
		  Java TreeSet class doesn't allow null element.
		  Java TreeSet class is non synchronized.
		  Java TreeSet class maintains ascending order.
		*/
		
		TreeSet<String> set = new TreeSet<>();
		set.add("Kolhapur"); set.add("Sangli"); set.add("Satara"); set.add("Pune");
		System.out.println(set);//store data in ascending order
		
		//Print ascending order
       Iterator<String> itr=set.iterator();
	     while (itr.hasNext()) {
		  System.out.println(itr.next());		
		}
	     
	    //Print descending order
	     Iterator<String> itr1= set.descendingIterator();
	     while (itr1.hasNext()) {
		  System.out.println(itr1.next());		
		}
	     System.out.println("-----------------------------------------");
	     TreeSet<Integer> i = new TreeSet<>();
	     i.add(1); i.add(5); i.add(8); i.add(3);
	     System.out.println(i);
	     System.out.println("Lowest value : " +i.pollFirst()); 
	     System.out.println("Highest value : " +i.pollLast()); 
	    
	     
	}

}
