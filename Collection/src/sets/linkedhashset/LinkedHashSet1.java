package sets.linkedhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		/*
		  Java LinkedHashSet class contains unique elements only like HashSet.
		  Java LinkedHashSet class provides all optional set operations and permits null elements.
		  Java LinkedHashSet class is non-synchronized.
		  Java LinkedHashSet class maintains insertion order.
	    */
		
		HashSet<String> set = new LinkedHashSet<>();
		//ignoring duplicate Elements
		set.add("One"); set.add("Two"); set.add("Three"); set.add("Four"); set.add("One");
		System.out.println(set);
		
		//Remove
		set.remove("One");//true
		set.remove("any");//false : this element not present in set
		
		
		Iterator itr = set.iterator();
        while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
