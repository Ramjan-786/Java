package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
   private String name;
   private String email;
   private String password;
   private double registrationAmount;
   private Date dob;
   
   public static SimpleDateFormat sdf;            //other classes need so use public access specifire
   
   static {
	   sdf = new SimpleDateFormat("dd-MM-yyyy");
   }

public Customer(String name, String email, String password, double registrationAmount, Date dob) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.registrationAmount = registrationAmount;
	this.dob = dob;
}

@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email +", registrationAmount="
			+ registrationAmount + ", dob=" + sdf.format(dob) + "]";
}
   
@Override
public boolean equals(Object o) {
	System.out.println("In Customer equals");
	if(o instanceof Customer) {
	Customer c = ((Customer)o);
	return email.equals(c.email);
	}
	return false;
}
   
}
