package com.app.vehicles;

public class Vehicle {
  private int registrationNo;
  private String color;
  private double price;
  
public Vehicle(int registrationNo, String color, double price) {
	super();
	this.registrationNo = registrationNo;
	this.color = color;
	this.price = price;
}

@Override
public String toString() {
	return "Vehicle [registrationNo=" + registrationNo + ", color=" + color + ", price=" + price + "]";
}
  
@Override
  public boolean equals(Object anotherObject){
	//unique Id for testing equality : regNo;
	System.out.println("in Vehicle equals....");
	if(anotherObject instanceof Vehicle)
	 //  return registrationNo == anotherObject.registrationNo; 
	//regNo can not found in Object class so we need downcasting
	return this.registrationNo == ((Vehicle)anotherObject).registrationNo; 
      return false;  
}
}
