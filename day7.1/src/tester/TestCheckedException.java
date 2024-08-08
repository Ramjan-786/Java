package tester;

public class TestCheckedException {

	public static void main(String[] args) {
		try {
         System.out.println("Before");
        //javac force handling of the checked Exception //here checked type Exception come          
             Thread.sleep(5000);//May throw java.lang.InterruptedException :  checked Exception
         System.out.println("After");
		}catch(Exception e) {
              e.printStackTrace();			
		}
		System.out.println("main cntd...");
		
	}

}
