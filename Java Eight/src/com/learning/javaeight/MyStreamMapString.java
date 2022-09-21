package com.learning.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamMapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listNames = new ArrayList<String>();
		listNames.add("Ram");
		listNames.add("Jam");
		listNames.add("Sam");
		listNames.add("Ramu");
		listNames.add("Raju");
		
		List<String> nameCapital = listNames.stream()
				.map(name->name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(listNames);
		System.out.println(nameCapital);

	}

}
