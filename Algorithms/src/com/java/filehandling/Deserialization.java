package com.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void  login(String userName, String password) {
		if(userName.equals("supreethgowda1997@gmail.com") && password.equals("Gmail@369")) {
			System.out.println("Login success....");
		} else {
			System.out.println("Login failed....");
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try {
			FileInputStream fis = new FileInputStream("c://J2ee/userLogin.ser");
			ObjectInputStream os = new ObjectInputStream(fis);
			
			UserLogin user = (UserLogin)(os.readObject());
			
			login(user.userName, user.password);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
