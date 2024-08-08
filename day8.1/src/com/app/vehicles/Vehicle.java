package com.app.vehicles;

import java.util.Date;

public class Vehicle {
  private int registrationNo;
  private String color;
  private double price;
  private Date manufacturingDate;

public Vehicle(int registrationNo, String color, double price, Date manufacturingDate) {
	this.registrationNo = registrationNo;
	this.color = color;
	this.price = price;
	this.manufacturingDate = manufacturingDate;
}

//Overloding construction
public Vehicle(int registrationNo, String color) {
	this.registrationNo = registrationNo;
	this.color = color;
}

//Note:-manufacturingDate che toString output detana d-m-y h-m-s IST ase yete v chuckiche date scanner kdun dile tari 
	// pan output dete
@Override
public String toString() {
	return "Vehicle [registrationNo=" + registrationNo + ", color=" + color + ", price=" + price
			+ ", manufacturingDate on" + manufacturingDate + "]";//toString call
}//here manufactureDate is a ref of Date class so toString call


@Override
  public boolean equals(Object anotherObject){
	System.out.println("in Vehicle equals....");
	if(anotherObject instanceof Vehicle) { 
        Vehicle v = ((Vehicle)anotherObject);//down casting
        return this.registrationNo == v.registrationNo && color.equals(v.color);
      }
		return false;  
	}
}
