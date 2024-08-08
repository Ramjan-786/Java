package value_passing;

public class Emp {
private int id;
private String name;
private double sal;

public Emp(int i, String n, double s) {
	id = i;
	name = n;
	sal = s;
}

public double getSal() {
	return sal;
}

public void setSal(double sal) {
	this.sal = sal;
}

}
