package com.learning.javaeight;

import java.util.Arrays;
import java.util.List;

public class MyStreamForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		numbers.stream()
				.map(num->num*num).forEach(n->System.out.println(n));

	}

}
