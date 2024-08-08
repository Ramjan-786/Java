package com.app.org;

public class Manager extends Employee{
	 private double performanceBonus;

	public Manager(int id, String name, String deptId, double basic, double performanceBonus) {
		super(id, name, deptId, basic);
		this.performanceBonus = performanceBonus;
	}

	@Override
	public String toString() {
		return "Manager" +super.toString() +" " +"performanceBonus=" + performanceBonus;
	}
	
	//getter
	public double getPerformanceBonus() {
		return performanceBonus;
	}


	@Override
	public double computeNetSalary() {
		return super.getBasic()+performanceBonus; 
	}
	 
	 

}
