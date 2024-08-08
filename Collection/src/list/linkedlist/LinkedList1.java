package list.linkedlist;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();
        al.add("Alan"); al.add("John"); al.add("Emma");al.add("Eva"); al.add(null);
        System.out.println("Normally Print 1: " +al);
        
        al.add(0, "Rock");//add element specified position
        System.out.println("Normally Print 2: " +al);

        LinkedList<String> al2 = new LinkedList<>();
        al2.add("Prince"); al.add("Queen");
        al.addAll(al2);//Add new list into old list
        
        al.addFirst("Ramjan");//Adding an element at the first position  
        al.addLast("Sonu"); //Adding an element at the Last position  
        System.out.println("Normally Print 3: " +al);
        
        al.remove(null);//remove by specific object
       System.out.println( "Remove by index : "+al.remove(1));// remove by index
        //al.removeAll(al);//remove all collection
       String first = al.removeFirst();
       System.out.println("First : " +first);
       //al.removeLast(); 
       //al.removeFirstOccurrence("Alan");
       //al.removeLastOccurrence("Sonu");
       //al.clear();
        
       Iterator itr=al.iterator();// Iterator in forward direction 
       while(itr.hasNext()) {
          System.out.print(itr.next() +" ");
       }
       System.out.println();
     Iterator ditr = al.descendingIterator();//Iterator in reverse direction 
       while(ditr.hasNext()) {
    	   System.out.print(ditr.next() +" ");
       }
    }
}
