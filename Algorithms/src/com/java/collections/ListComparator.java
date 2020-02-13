package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparator {

	public static void main(String[] args) {
		
		List<MobilePhones> mobile = new ArrayList<>();
		mobile.add(new MobilePhones("Honor", "9Lite", 64, 1344.2));
		mobile.add(new MobilePhones("Apple", "iPho7", 64, 6165.5));
		mobile.add(new MobilePhones("Infix", "Inf2X", 32, 3675.7));
		mobile.add(new MobilePhones("Nokia", "Lumia", 16, 5874.4));
		
		Collections.sort(mobile, (arg0, arg1)-> 
		{
			return arg0.ram > arg1.ram ? 1:-1;	
		});
		
		for(MobilePhones m : mobile) {
			System.out.println(m);
		}
	}
}
