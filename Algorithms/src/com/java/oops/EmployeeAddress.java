package com.java.oops;

public class EmployeeAddress {
	
	private String city;
	private String state;
	private String nation;
	
	public EmployeeAddress(String city, String state, String nation) {
		super();
		this.city = city;
		this.state = state;
		this.nation = nation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [City : " + city + ", State : " + state + ", Nation : " + nation + "]";
	}	
}
