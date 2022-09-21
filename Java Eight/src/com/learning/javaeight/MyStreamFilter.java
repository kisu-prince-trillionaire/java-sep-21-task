package com.learning.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listNames = new ArrayList<String>();
		listNames.add("Ram");
		listNames.add("Jam");
		listNames.add("Sam");
		listNames.add("Ramu");
		listNames.add("Raju");
		
		List<String> nameStartsWithR = listNames.stream()
				.filter(name -> name.startsWith("R")).collect(Collectors.toList());
		
		System.out.println(listNames);
		System.out.println(nameStartsWithR);

	}

}
