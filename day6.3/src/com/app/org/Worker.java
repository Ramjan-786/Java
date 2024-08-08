package com.app.org;

public class Worker extends Employee{
	private double hoursWorked;
	private int hourlyRate;
	
	public Worker(int id, String name, String deptId, double basic, double hoursWorked, int hourlyRate) {
		super(id, name, deptId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "Worker" +super.toString() +" " + "hoursWorked=" + hoursWorked +" " +" hourlyRate=" + hourlyRate;
	}

	@Override
	public double computeNetSalary() {
		return super.getBasic() + (hoursWorked * hourlyRate);
	}

	//getter
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	
	

}
