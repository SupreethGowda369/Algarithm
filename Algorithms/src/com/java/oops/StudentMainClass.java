package com.java.oops;

public class StudentMainClass {
	
	public static void main(String[] args) {
		
		Student student = new Student("Supreeth", "4BW15EC093", "ECE", 525, 7337711366l);
		
		System.out.println("------------------------");
		student.showDetails();
		System.out.println("------------------------");
		
		System.out.println("Name       : "+student.getName());
		System.out.println("USN        : "+student.getUsn());
		System.out.println("Branch     : "+student.getBranch());
		System.out.println("Percentage : "+student.getMarks()/600*100);
		System.out.println("Contact    : "+student.getContactNo());
		System.out.println("------------------------");
	}
}
