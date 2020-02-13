package com.java.oops;

public class Student {
	
	private String name;
	private String usn;
	private String branch;
	private double marks;
	private long contactNo;
	
	public Student(String name, String usn, String branch, double marks, long contactNo) {
		super();
		this.name = name;
		this.usn = usn;
		this.branch = branch;
		this.marks = marks;
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	public void showDetails()
	{
		System.out.println("Name       : " +name);
		System.out.println("USN        : " +usn);
		System.out.println("Branch     : " +branch);
		System.out.println("Percentage : " +(getMarks()/600)*100 +"%");
		System.out.println("Contact    : " +contactNo);
	}
}
