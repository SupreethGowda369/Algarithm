package com.java.oops;

public interface Card {
	
	public void makePayment();
}

class DebitCard implements Card {
	
	@Override
	public void makePayment() {
		System.out.println("Payment done through DebitCard.....");
	}
}

class CreditCard implements Card {
	
	@Override
	public void makePayment() {
		System.out.println("Payment done through CreditCard.....");
	}
}

class SwipeMachine {
	public static void swipeCard(Card cd)
	{
		cd.makePayment();
	}
}

