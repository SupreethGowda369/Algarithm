package com.java.oops;

public class HelperClass {

	public static void main(String[] args) {

		EmployeeAddress empAdd = new EmployeeAddress("Bengaluru", "Krnataka", "India");
		empAdd.setCity("Bengaluru");
		empAdd.setState("Karnataka");
		empAdd.setNation("India");
		
		Employee emp = new Employee("Supreeth", "IBM India", empAdd);
		emp.setEmpName("Supreeth");
		emp.setEmpCompany("IBM India");
		
		System.out.println("Employee Name    : " + emp.getEmpName());
		System.out.println("Employee Company : " + emp.getEmpCompany());
		System.out.println("Employee City    : " + empAdd.getCity());
		System.out.println("Employee State   : " + empAdd.getState());
		System.out.println("Employee Nation  : " + empAdd.getNation());
		
		System.out.println(emp);
	}
}
