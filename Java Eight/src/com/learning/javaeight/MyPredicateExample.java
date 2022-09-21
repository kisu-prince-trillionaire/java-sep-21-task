package com.learning.javaeight;

import java.util.function.Predicate;

public class MyPredicateExample {
	static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Number " + number);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pred(10, (i) -> i > 7);

	}

}
