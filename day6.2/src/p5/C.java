package p5;

public class C implements A, B{
	
	@Override
	public double calc(double a, double b) {
	System.out.println(A.DATA +" " +B.DATA); //DATA exits in both i/f so called by i/f name.variable
		return a+b;
	}

}
