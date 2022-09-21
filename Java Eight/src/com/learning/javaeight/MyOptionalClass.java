package com.learning.javaeight;

import java.util.Optional;

public class MyOptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = new String[5];
		name[2] = "Ramayan";
		Optional<String> optional = Optional.ofNullable(name[2]);
		if(optional.isPresent()) {
			int length = name[2].length();
			System.out.println("Length is : " + length);
		}else {
			System.out.println("No value present");
		}
		

	}

}
