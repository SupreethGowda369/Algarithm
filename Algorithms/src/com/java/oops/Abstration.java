package com.java.oops;

interface Telivision {
	
	public String brand();
	public String display();
	public double price();
}

class LG implements Telivision {

	@Override
	public String brand() {
		return "LG";
	}

	@Override
	public String display() {
		return "LCD Display";
	}

	@Override
	public double price() {
		return 13000;
	}
}

class Samsung implements Telivision {

	@Override
	public String brand() {
		return "Samsung";
	}

	@Override
	public String display() {
		return "LED Display";
	}

	@Override
	public double price() {
		return 1000;
	}
}
class ShowDetails {
	
	public static Telivision showDetails(String ch) {
		
		Telivision teli;
		
		if (ch == "LG") {
			teli = new LG();
		} else {
			teli = new Samsung();
		}
		return teli;	
	}
}

public class Abstration {

	public static void main(String[] args) {
	
		Telivision teli = ShowDetails.showDetails("LG");
		
		System.out.println("Brand   : " + teli.brand());
		System.out.println("Dispaly : " + teli.display());
		System.out.println("Price   : " + teli.price());
	}
}
