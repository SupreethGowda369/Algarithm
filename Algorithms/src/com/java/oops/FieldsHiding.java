package com.java.oops;

public class FieldsHiding {

	public static void main(String[] args) {
		
		Card card1 = new DebitCard();
		SwipeMachine.swipeCard(card1);
		
		Card card2 = new CreditCard();
		SwipeMachine.swipeCard(card2);	
	}
}
