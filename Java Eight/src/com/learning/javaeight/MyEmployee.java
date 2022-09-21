package com.learning.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyEmployee {
	
	public static void main(String[] args) {
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
		System.out.println(listEmp);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Name Ending with m are");
		List<Employee> list1 = listEmp.stream().filter(emp->emp.getName().endsWith("m"))
				.collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------------------------------------");
		System.out.println("After Sorting the name");
		List<Employee> sortName = listEmp.stream()
				.sorted((p1, p2) -> ((String) p1.getName()).compareToIgnoreCase(p2.getName()))
                .collect(Collectors.toList());
		
		System.out.println(sortName);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------------------------------------");
		System.out.println("After sorting salary ");
		List<Employee> listsalary = listEmp.stream().sorted()
				.collect(Collectors.toList());
		
		System.out.println(listsalary);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------------------------------------");
		System.out.println("Total Salary paid ");
		double totalSalary = listEmp.stream().collect(Collectors.summingDouble(salary -> salary.getSalary()));
		System.out.println(totalSalary);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------------------------------------");
		System.out.println("Maximum Salary paid is");
		Employee maxSalary = listEmp.stream()
				.max((salary1,salary2)->salary1.getSalary()>salary2.getSalary()?1:-1).get();
		
		System.out.println(maxSalary);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------------------------------------");
		System.out.println("Minimum Salary paid is");
		Employee minSalary = listEmp.stream()
				.min((salary1,salary2)->salary1.getSalary()>salary2.getSalary()?1:-1).get();
		
		System.out.println(minSalary);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("----------------------------------------------------");
		System.out.println("No of Employee Having Salary greater than 70k");
		long count = listEmp.stream().filter(salary -> salary.getSalary()>70).count();
		
		System.out.println(count);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}

}
