package com.app.org;

public class Employee {
    private int id;
    private String name;
    private String deptId;
    private double basic;
    
	public Employee(int id, String name, String deptId, double basic) {
//		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", deptId=" + deptId + ", basic=" + basic + "]";
	}
    
    public double computeNetSalary() {
    	return 0;
    }

	public double getBasic() {
		return basic;
	}
    
    
}
