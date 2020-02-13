package com.java.filehandling;

import java.io.File;
import java.io.FileWriter;

public class WriteDataToFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		File file = new File("c://J2ee/FileHandling/file.txt");
		
		try {
			FileWriter writer = new FileWriter(file);
			
			writer.write("Supreeth Gowda From \'INDIA\'.");
			writer.flush();
			
			System.out.println("File Writing Completed.....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
