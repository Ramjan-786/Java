package com.app.core;

import java.util.Arrays;

//when customer select package then his getting services 
public enum CustomerCategory {
	//state data attached to CC and this init by constructor
   SILVER(500,new String[]{"platform"}),
   GOLD(1000,new String[]{"platform","web server"}),
   DIAMOND(500,new String[]{"platform","web server","app deployment"}),
   PLATINUM(500,new String[]{"platform","web server","app deployment","Doker"});
	
//additional states
   private double charges;
   private String[] services;
   
   //add parameterized constr to init additional states
    CustomerCategory(double charges, String[] services) {   //here constr by default private 
	//super(name, ordinal) : implicitly called by : javac
    	this.charges = charges;
    	this.services = services;
    }

  //for later validation : supply getters
	public double getCharges() {
		return charges;
	}

	public String[] getServices() {
		return services;
	}
	
	@Override
	public String toString() {       //only services put that show the address of array so use below
		return name()+" charges : "+charges+" Services : "+Arrays.toString(services);
	}
}
