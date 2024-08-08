package learn1;

public class class1 {
/*
	public static void main(String[] args) {
          Student s = new Student();
        //s.Student(); constructor not call explicitly
          s.disp();
          Student s2 = new Student();
          s2.disp();
          Student s3 = s;
          s3.disp();
	}
*/
	/*
	public static void main(String[] args) {
      Student st1 = new Student();
      System.out.println("Id of st1 ="+st1.getId());
      st1.setId(5);
      System.out.println("Id of st1 ="+st1.getId());
	}
*/
	/*
	public static void main(String[] args) {
		Student st1=new Student(); 
		st1.disp();
		st1.accept();
		st1.disp();
		}
*/
	/*
	public static void main(String[] args) {
		Student st1=new Student();
		System.out.println(st1); // it implicitely calls toString()
		System.out.println(st1.toString()); // explicit ca;;
	}
*/
	
	public static void main(String[] args) {
		Student st1=new Student();
		st1.disp();
		
		Student st2=new Student(10,22,35,"Ramjan",56.7f);
		st2.disp();
	}
	
}
