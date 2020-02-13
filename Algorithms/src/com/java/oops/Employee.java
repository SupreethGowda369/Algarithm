package com.java.oops;

public class Employee {

	private String empName;
	private String empCompany;
	private EmployeeAddress empAddress;

	public Employee(String empName, String empCompany, EmployeeAddress empAddress) {
		super();
		this.empName = empName;
		this.empCompany = empCompany;
		this.empAddress = empAddress;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCompany() {
		return empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}

	public EmployeeAddress getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(EmployeeAddress empAddress) {
		this.empAddress = empAddress;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpName : " + empName + ", EmpCompany : " + empCompany + ", EmpAddress : " + empAddress + "]";
	}
}
