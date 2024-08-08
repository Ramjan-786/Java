package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
	private int id;
	private String name;
	private double salary;
	private Department dept;
	private Date joinDate;
	
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public Emp(int id, String name, double salary, Department dept, Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.joinDate = joinDate;
	}
//Contr Overloading
	public Emp(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", "
				+ "dept=" + dept + ", joinDate=" + sdf.format(joinDate)
				+ "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("In Emp equals");
		if(o instanceof Emp) {
	      Emp e = ((Emp)o);
		return this.id == e.id;
		}
		return false;
	}	
}
