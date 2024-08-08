package tester;
//throws keyword only tell to main thread main/any method does not handle exception by me its handled by you.
//from throws keyword javac satisfy but JVM(RunTime) error occured.
public class TestCheckedException2 {

	public static void main(String[] args) throws InterruptedException{
         System.out.println("Before");
        //javac force handling of the checked Exception //here checked type Exception come          
             Thread.sleep(5000);//May throw java.lang.InterruptedException :  checked Exception
         System.out.println("After");
	
		System.out.println("main cntd...");
		
	}

}
