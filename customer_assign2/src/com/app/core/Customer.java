package com.app.core;
import java.text.ParseException;
//Note : Adhar card make as inner class behind the resone is direct don't create instance of AC without customer instance creation
//AC inner class banvle tari yamdhe relation nahi banat tyasathi use data member of AC
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
   private String name;
   private String email;
   private String password;
   private double registrationAmount;
   private Date dob;
   //HAS-A
   private CustomerCategory category;
   
   //Customer HAS-A AdharCard 
   private AdharCard adharCard;//tight coupling : Composition
   
   public static SimpleDateFormat sdf;            //other classes need so use public access specifire
   
   static {
	   sdf = new SimpleDateFormat("dd-MM-yyyy");
   }

public Customer(String name, String email, String password, double registrationAmount, Date dob, CustomerCategory category) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.registrationAmount = registrationAmount;
	this.dob = dob;
	this.category =category;
}

//constructor overloading
public Customer(String email) {
	super();
	this.email = email;
}

//getter for category
public CustomerCategory getCategory() {
	return category;
}

//setter for category
public void setCategory(CustomerCategory category) {
	this.category = category;
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder(" ");
	if(adharCard == null)
		sb.append("AdharCard not yet linked !");
	else
		sb.append(adharCard);//adharCard.toSting()
	return "Customer [name=" + name + ", email=" + email +", registrationAmount="
			+ registrationAmount + ", dob=" + sdf.format(dob) + ", category=" + category 
			 + ", AdharCard Details="+sb.toString() +"]";          //category.toString() from Enum           
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

//add a non static method , to link adhar card details to this customer
public void linkAdharCard(String uid, String creationDate) throws ParseException{
	this.adharCard = new AdharCard(uid, sdf.parse(creationDate));
}


  //create non static nested class(Inner class) : to represent Adhar card details
 		class AdharCard{
 			private String uid;
 			private Date createdOn;
 			
			public AdharCard(String uid, Date createdOn) {
				super();
				this.uid = uid;
				this.createdOn = createdOn;
			}
			@Override
			public String toString() {
				return "AdharCard [uid=" + uid + ", createdOn=" + sdf.format(createdOn) + "]";
			}
		}

}
