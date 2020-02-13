package com.java.collections.set;

import java.util.HashMap;

public class HashMap2 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> capitals = new HashMap<String, String>();
		
		capitals.put("Bhaarath", "Indraprastha");
		capitals.put("Russia", "Masco");
		capitals.put("USA", "Washinton DC");
		capitals.put("Japan", "Tokyo");
		capitals.put("Australia", "Canbera");
		capitals.put("SriLanka", "Colambo");
		capitals.put("Nepal", "Katmandu");
		
		System.out.println(capitals);
		
		System.out.println("---------------------");
		
		for(String x: capitals.keySet())
		{
			System.out.println(x + " = " + capitals.get(x));
		}
		
		System.out.println("---------------------");
		
		for(String x: capitals.values())
		{
			System.out.println(x);
		}
	}
}
