package tester;

public class TestFinally4 {

	public static void main(String[] args) {
          System.out.println("1");
          try {
          testMe();
          System.out.println("back in main");
          }catch(Exception e){
        	  System.out.println("in main's catch-all " +e);
          }finally {
			System.out.println("in main's finally");
		}
          System.out.println("main's over..");
	}

	 private static void testMe() throws InterruptedException{
		 try {
		 System.out.println("in meth's try");
		 String[] ss = {"aa","bb"};
         Thread.sleep(1000);//checked exception may occurred
         System.out.println(ss[1]);//unchecked exception occur & throws for checked exception not or unchecked exception
         boolean flag = true;
         if(flag)
        	 System.exit(0);   //Terminates the currently running Java Virtual Machine.
         //means all code terminated without any single line executed
         System.out.println("End of try");
		 }finally {
			System.out.println("in meth's finally");
		}
		 System.out.println("meth's end");
		 } 
}
