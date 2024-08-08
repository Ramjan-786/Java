package learn1;

import java.util.Scanner;

public class Student {
 private int id;
 private int rollno;
 private int marks;
 private String name;
 private float per;
 
 Scanner sc = new Scanner(System.in);
 
 public Student(){
	 System.out.println("Inside Parameter Constructor");
	 this.id = 1;
     this.rollno = 21;
     this.marks = 56;
     this.name = "ramjan";
     this.per = 1.1f;
 }

 
 
public Student(int id, int rollno, int marks, String name, float per) {
	System.out.println("Inside Parametrized Constructor");
	this.id = id;
	this.rollno = rollno;
	this.marks = marks;
	this.name = name;
	this.per = per;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getPer() {
	return per;
}

public void setPer(float per) {
	this.per = per;
}

@Override
public String toString() {
	return "Student [id=" + id + ", rollno=" + rollno + ", marks=" + marks + ", name=" + name + ", per=" + per + "]";
}

public void accept() {
	System.out.println("Enter Id :");
	this.id = sc.nextInt();
	System.out.println("Enter Roll No :");
	this.rollno = sc.nextInt();
	System.out.println("Enter Marks :");
	this.marks = sc.nextInt();
	System.out.println("Enter Name :");
	this.name = sc.next();
	System.out.println("Enter Percentage :");
    this.per = sc.nextFloat();  
}
 
 public void disp() {
	 System.out.println("Student Data");
	 System.out.println("Name :"+this.name+"ID :"+this.id);
	 
	 }
 
 
 
 
 
 
}
