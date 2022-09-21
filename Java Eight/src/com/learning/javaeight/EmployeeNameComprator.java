package com.learning.javaeight;

import java.util.Comparator;

public class EmployeeNameComprator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2)  {
		return e1.getName().compareTo(e2.getName());
	}

}
