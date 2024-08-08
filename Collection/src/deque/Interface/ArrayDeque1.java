//Queue--->extend--->Deque---->implement----->ArrayDeque
package deque.Interface;

import java.util.ArrayDeque;
import java.util.Deque;

//Deque is the sub-type of the interface queue.Deque supports the addition as well as the removal of elements
//from both ends of the data structure. Therefore, a deque can be used as a stack or a queue. 
public class ArrayDeque1 {
/*	1.Unlike Queue, we can add or remove elements from both sides.
	2.Null elements are not allowed in the ArrayDeque.
	3.ArrayDeque is not thread safe, in the absence of external synchronization.
	4.ArrayDeque has no capacity restrictions.
	5.ArrayDeque is faster than LinkedList and Stack.*/
	public static void main(String[] args) {
         Deque<String> dq = new ArrayDeque<>();
         dq.add("Summer"); dq.add("rainy"); dq.add("Winter");
        System.out.println("Before changes : " +dq);
        dq.offerFirst("Good");//add first element
        dq.poll();//remove first element
        dq.pollFirst();//remove first element
        dq.pollLast();//remove last element
        System.out.println("After changes : " +dq);


	}

}
