package lists;
//Note : collection only store ref type data : NO primitive type data
import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		//create empty list to hold Integer type of reference
		//ArrayList<E>: E stand for element type
		ArrayList<Integer> list = new ArrayList<>();//create only empty Arraylist object
		System.out.println(list.size());//0 : no data added :Returns the number of elements in this list.
		System.out.println(list.isEmpty());//true
		
		//array data added into ArrayList
		int[] data = {10,12,44,5,67,-25,7,89,03,10};//dynamic initialize array
		
		//array add into arrayList by using : add()
		for(int i : data)//line no 14 added into line no 10
			list.add(i);//int ---> Integer(auto boxing)
		
		//can you use for-each loop to ArrayList : Yes(since arrayList IS-A Iterable)
		for(int i : list)//Integer ---> Int(auto un boxing)
			System.out.print(i +" ");
			System.out.println();
	
		//contains : searching
		System.out.println(list.contains(101) ? "Found" : "Not Found");
		System.out.println(list.indexOf(10) +" " +list.lastIndexOf(10));
	}
	

}
