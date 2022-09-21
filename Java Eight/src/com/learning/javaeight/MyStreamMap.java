package com.learning.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamMap {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		List<Integer> squares = numbers.stream()
				.map(num->num*num).collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(squares);
	}

}
