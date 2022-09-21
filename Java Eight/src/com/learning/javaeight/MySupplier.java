package com.learning.javaeight;

import java.util.function.Supplier;

public class MySupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> ref = () -> {
			return 30;
		};
		System.out.println(ref.get());

	}

}
