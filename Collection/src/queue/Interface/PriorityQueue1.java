package queue.Interface;

import java.util.*;

public class PriorityQueue1 {

	public static void main(String[] args) {
            PriorityQueue<String> pq = new PriorityQueue<>();
//NOTE: sometimes the elements of the queue are needed to be processed according to the Priority.            
            pq.add("London"); pq.add("America"); pq.add("India"); pq.add("Rus");
            System.out.println("head " +pq.element());//print first element
            System.out.println("head " +pq.peek());//print first element
            System.out.println("Print befor rmove : " +pq);
            System.out.println("Remove first obj : " +pq.remove());
            System.out.println("First in first out : " +pq.poll());
            Iterator itr = pq.iterator();
            while(itr.hasNext()) {
            	System.out.println(itr.next());
            }
            
            
	}

}
