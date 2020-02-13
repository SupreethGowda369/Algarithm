package com.java.collections.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap1
{
	public static void main(String[] args) 
	{
		HashMap<String, String> capitals = new HashMap<String, String>();
		
		capitals.put("India", "Indraprastha");
		capitals.put("Russia", "Masco");
		capitals.put("USA", "Washinton DC");
		capitals.put("Japan", "Tokio");
		capitals.put("Australia", "Canbera");
		capitals.put("SriLanka", "Colambo");
		capitals.put("Nepal", "Katmandu");
		
		System.out.println(capitals);
		
		Set<String> keys = capitals.keySet();
		
		Iterator<String> x = keys.iterator();
		while(x.hasNext() == true)
		{
			System.out.println(capitals.get(x.next()));
		}
	}
}
