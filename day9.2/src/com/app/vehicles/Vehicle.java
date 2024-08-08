package com.app.vehicles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
  private int registrationNo;
  private String color;
  private double price;
  private Date manufacturingDate;
  //Has-A enum (weaker form of association : aggregation)
  private VehicleType type;
/*Note:- inner class access directly data member of outer class 
but outer cls can not access directly data member of inner cls */
  //Has-A : inner cls (Strong form of association) : composition
  private DeliveryAddress address;
  
  //add single copy of SDF
  public static SimpleDateFormat sdf;//converter String-->Date  and   Date--->String
  	
  static {
	  sdf = new SimpleDateFormat("dd-MM-yyyy");
  }

public Vehicle(int registrationNo, String color, double price, Date manufacturingDate, VehicleType type) {
	this.registrationNo = registrationNo;
	this.color = color;
	this.price = price;
	this.manufacturingDate = manufacturingDate;
	this.type = type;
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
			+ ", manufacturingDate on" + sdf.format(manufacturingDate) +", VehicleType=" +type +"]";
}                                        //String java.text.DateFormat.format(Date date)   type.toString() from Enum

@Override
  public boolean equals(Object anotherObject){
	System.out.println("in Vehicle equals....");
	if(anotherObject instanceof Vehicle) { 
        Vehicle v = ((Vehicle)anotherObject);//down casting
        return this.registrationNo == v.registrationNo;
      }
		return false;  
	}
//when vehicle purchase then address instance created and attached to vehicle object
//add method in outer cls to link delivery address to the purchased vehicle
	public void linkDeliveryAddress(String city,String state,String country,String zipCode,String phoneNo) {
	     address = new DeliveryAddress(city, state, country, zipCode, phoneNo);
	}

//inner class : non static nested class
	public class DeliveryAddress{
		private String city,state,country,zipCode,phoneNo;
            //constructor of inner class
		public DeliveryAddress(String city, String state, String country, String zipCode, String phoneNo) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
			this.phoneNo = phoneNo;
		}
	//toString method
		@Override
		public String toString() {
			return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode="
					+ zipCode + ", phoneNo=" + phoneNo + "]";
		}
		
		
	}
}
