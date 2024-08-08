package com.app.vehicles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
  private int registrationNo;
  private String color;
  private double price;
  private Date manufacturingDate;
  //add single copy of SDF
  public static SimpleDateFormat sdf;//converter String-->Date  and   Date--->String
  	
  static {
	  sdf = new SimpleDateFormat("dd-MM-yyyy");
  }

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
	// pan output dete so use format method 
@Override
public String toString() {
	return "Vehicle [registrationNo=" + registrationNo + ", color=" + color + ", price=" + price
			+ ", manufacturingDate on" + sdf.format(manufacturingDate) + "]";
}                                        //String java.text.DateFormat.format(Date date)

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
