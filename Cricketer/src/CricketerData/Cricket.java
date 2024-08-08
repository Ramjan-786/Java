package CricketerData;

import java.util.ArrayList;
import java.util.Scanner;

public class Cricket implements Comparable<Cricket>{
	//String name,int age,String email_id,String Phone,int rating
	private String name;
	private int age;
	private String email_id;
	private String phone;
	private int ratings;
	
	Scanner sc = new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Cricket [name=" + name + ", age=" + age + ", email_id=" + email_id + ", phone=" + phone + ", ratings="
				+ ratings + "]";
	}
	public Cricket() {
		super();
	}
	public Cricket(String name, int age, String email_id, String phone, int ratings) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone = phone;
		this.ratings = ratings;
	}
	ArrayList<Cricket> cricketers = new ArrayList<Cricket>();
	
	public static Cricket findbyname(String name,ArrayList<Cricket> cricketers ) {
		for (Cricket c : cricketers)
			if(c.getName().equals(name))
				return c;
		return null;
	}
	public void deletebyname(String name,ArrayList<Cricket> cricketers) {
		Cricket c1 = findbyname(name, cricketers);
		System.out.println(cricketers.remove(c1));
		System.out.println("player removed");
	}
	
	public void updateratings(String name,ArrayList<Cricket> cricketers) {
		System.out.println("Enter ratings to update");
		int ratings = sc.nextInt();
		for (Cricket c : cricketers)
			if(c.getName().equals(name))
				c.setRatings(ratings);
		System.out.println("Ratings updated");
	}
	
	@Override
	public int compareTo(Cricket o) {
		if(this.ratings > o.ratings)
			return 1;
		if(this.ratings < o.ratings)
			return -1;
		else 
			return 0;
		
	}
	
	

}