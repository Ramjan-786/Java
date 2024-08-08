package sets.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset1 {

	public static void main(String[] args) {
     /*
       HashSet stores the elements by using a mechanism called hashing.
        HashSet allows null value.
		HashSet class is non synchronized.
		HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
		HashSet contains unique elements only.
		HashSet is the best approach for search operations.
		The initial default capacity of HashSet is 16, and the load factor is 0.75.
       */
			Set<String>set = new HashSet<>();
			//HashSet ignore duplicate value : here One is not inserted into set
			set.add("One"); set.add("two"); set.add("three"); set.add("four"); set.add("One");
			System.out.println(set);
			
			//remove element 
			set.remove("One");
//			set.removeAll(set);
//			set.removeIf(str->str.contains("nine"));
//			set.clear();
			
			//create new set
			Set<String> set1 = new HashSet<>();
			set1.add("nine"); set.add("ten");
			//add new set value into old set
			set.addAll(set1);

			Iterator itr=set.iterator();
			while (itr.hasNext()) {
	        System.out.println(itr.next());//data print any sequence
		}
			
			//Add any collection into set
			ArrayList<String> al = new ArrayList<>();
			al.add("mango"); al.add("Banana");
			
			HashSet<String> set2 = new HashSet<>(al);//Add arrayList into set with parameterized constructor
			set2.add("apple");
			System.out.println(set2);
	}

}
