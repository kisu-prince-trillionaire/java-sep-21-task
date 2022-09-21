package com.learning.javaeight;

public class Employee implements Comparable<Employee>{
	private int eId;
	private String name;
	private int salary;
	public Employee() {
	}
	public Employee(int eId, String name, int salary) {
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[" + eId + ", " + name + ", " + salary + "]";
	}
	
	public int compareTo(Employee emp) {
		if(this.salary>emp.salary)
			return -1;
		else if(this.salary<emp.salary)
			return 1;
		else
			return 0;
			
	}

}
