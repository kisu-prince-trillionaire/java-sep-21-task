package com.learning.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101,"Ram",60);
		Employee emp2 = new Employee(102,"Jam",90);
		Employee emp3 = new Employee(103,"Tam",50);
		Employee emp4 = new Employee(104,"Bam",40);
		Employee emp5 = new Employee(105,"Aam",30);
		
		List<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);
		listEmp.add(emp4);
		listEmp.add(emp5);
		
		System.out.println("----------------------Filter--------------------");
		List<Employee> list1 = listEmp.stream().filter(emp->emp.getName().startsWith("T"))
				.collect(Collectors.toList());
		System.out.println(listEmp);
		System.out.println(list1);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------Sorted--------------------");
		List<Employee> list2 = listEmp.stream().sorted()
				.collect(Collectors.toList());
		System.out.println(listEmp);
		System.out.println(list2);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------Map--------------------");
		List<String> list3 = listEmp.stream().map(name->name.getName().toUpperCase())
				.collect(Collectors.toList());
		System.out.println(listEmp);
		System.out.println(list3);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------ForEach--------------------");
		listEmp.stream().map(name->name.getName().toUpperCase())
				.forEach(data->System.out.println(data));
		System.out.println(listEmp);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}

}
