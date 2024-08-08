package Strings;
//Note:- Please refer java doc
//Note:- String Builder class not override equal method from object class check by ref equality
public class Test5StringBuilder {
//StringBuilder is a mutable[changeable] means string sarkhe different obj nahi banar
	public static void main(String[] args) {
		//crate a string builder object initialize with some string
		 StringBuilder sb = new StringBuilder("hello");
		 System.out.println("sb content " +sb);//hello
		 //length for your providing string and capacity is by defult 16 
		 System.out.println("len " +sb.length() +" " +"capa " +sb.capacity());//5 16+5=21
		 sb.append(21.3);
		 System.out.println(sb);//hello21.3
		 sb.append(true).append(1234).append(33.3F);
		 System.out.println(sb);//hello21.3true123433.3
	     StringBuilder sb1 = sb.replace(0, 5, "HELLO");
		 System.out.println(sb);//HELLO21.3true123433.3
		 System.out.println(sb1);//HELLO21.3true123433.3
		 System.out.println(sb==sb1);//true
		 System.out.println(sb.equals(sb1));//true : refer line 3
		 StringBuilder sb2 = new StringBuilder("hello");
		 StringBuilder sb3 = new StringBuilder("hello");
		 System.out.println(sb2==sb3);//false
		 System.out.println(sb.equals(sb3));//false refer line 3
				 
		 
	}

}
