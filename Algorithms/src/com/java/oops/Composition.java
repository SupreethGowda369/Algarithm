package com.java.oops;

class Account1 {
	
	String name = "Supreeth";
	String bio = "Nothing";
	int follewers = 10;
	int following = 10;
	int post = 5;
	
	public void dispAccount() {
		
		System.out.println("Name      : " + name);
		System.out.println("Biography : " + bio);
		System.out.println("Followers : " + follewers);
		System.out.println("Followers : " + following);
		System.out.println("Post      : " + post);
	}
}

class User {
	
	Account1 account = new Account1();
	public void login() {
		System.out.println("Login done....");
	}
}

public class Composition {

	public static void main(String[] args) {
		
		User user = new User();
		user.login();
		user.account.dispAccount();
	}
}