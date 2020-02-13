package com.java.collections;

public class MobilePhones {
	
	String mobilename;
	String mobileBrand;
	int ram;
	double price;
	
	public MobilePhones(String mobilename, String mobileBrand, int ram, double price) {
		super();
		this.mobilename = mobilename;
		this.mobileBrand = mobileBrand;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public String toString() {
		return "MobilePhones [Mobilename : " + mobilename + ", MobileBrand : " + mobileBrand + ", RAM : " + ram + ", Price : "
				+ price + "]";
	}
	
}
