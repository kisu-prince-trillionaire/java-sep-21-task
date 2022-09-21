package com.learning.javaeight;

import java.util.function.Consumer;

public class ConsumerDemo {
	public Consumer<Integer> useConsumer() {
		Consumer<Integer> ref = (num)->{
			if(num%2 == 0) {
				System.out.println("Even Number");
			}else {
				System.out.println("Odd Number");
			}
		};
		return ref;
	}

}
