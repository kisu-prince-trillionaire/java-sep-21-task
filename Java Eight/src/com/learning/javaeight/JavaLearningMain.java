package com.learning.javaeight;

public class JavaLearningMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation ref = (num1, num2) ->{
			int sum = num1 + num2;
			System.out.println("Addition : " +sum);
		};
		ref.addition(100, 200);
		ref.addition(4, 5);
		
		OperationNoArgs ref1 = ()->System.out.println("No argument lambda");
		ref1.display();
		
		OperationReturnValue ref3 = (num1,num2) ->{
			int sum = num1 + num2;
			return sum;
		};
		System.out.println("Addition : " + ref3.add(15, 30));
		
//		ConsumerDemo obj = new ConsumerDemo();
//		obj.accept(10);

	}

}
