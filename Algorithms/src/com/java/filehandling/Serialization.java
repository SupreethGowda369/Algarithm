package com.java.filehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class UserLogin implements Serializable{
	String userName;
	String password;
	
	public UserLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}	
}

public class Serialization {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		UserLogin user = new UserLogin("supreethgowda1997@gmail.com", "Gmail@369");
		
		try {
			FileOutputStream fos = new FileOutputStream("c:/J2ee/userLogin.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(user);
			System.out.println("Object Serialized...");
				
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
