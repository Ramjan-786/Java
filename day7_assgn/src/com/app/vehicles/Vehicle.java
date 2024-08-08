package com.app.vehicles;

public class Vehicle {
  private int registrationNo;
  private String color;
  private double price;
  

public Vehicle(int registrationNo, String color, double price) {
	this.registrationNo = registrationNo;
	this.color = color;
	this.price = price;
}

//Overloding construction
public Vehicle(int registrationNo, String color) {
	this.registrationNo = registrationNo;
	this.color = color;
}

@Override
public String toString() {
	return "Vehicle [registrationNo=" + registrationNo + ", color=" + color + ", price=" + price + "]";
}

public int getRegistrationNo() {
	return registrationNo;
}

public String getColor() {
	return color;
}

@Override
  public boolean equals(Object anotherObject){
	//unique Id for testing equality : regNo;
	System.out.println("in Vehicle equals....");
	if(anotherObject instanceof Vehicle) {
	 //  return registrationNo == anotherObject.registrationNo; 
	//regNo can not found in Object class so we need downcasting
	//return this.registrationNo == ((Vehicle)anotherObject).registrationNo && this.color == ((Vehicle)anotherObject).color; 
        Vehicle v = ((Vehicle)anotherObject);//down casting
        //similar to --->           //double d =34.4;   //int a = d [error yenar]
                                    // int a = ((int)d)
        //return this.registrationNo == v.registrationNo && this.color == v.color; // color is String so it is hold address so error got means you are compare two references
        return this.registrationNo == v.registrationNo && color.equals(v.color);//Here is compare 2 content. color is String type so we invoke String class method is overridden by object class
        
	}
		return false;  
}
}
