package com.people.practise;

import java.util.ArrayList;
import java.util.List;

public class Employee {
 
	String name;
	String department;
	int id;
	double salary;
	int exp;

	public Employee(String name, String department, int id, double salary, int exp) {
		super();
		this.name = name;
		this.department = department;
		this.id = id;
		this.salary = salary;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", id=" + id + ", salary=" + salary + ", exp="
				+ exp + "]";
	}

	public static void main(String[] args) {
		List<Employee> a1 = new ArrayList<Employee>();
		a1.add(new Employee("sai", "Accounts", 25, 52000, 5));
		a1.add(new Employee("Naresh", "manager", 15, 89000, 5));
		a1.add(new Employee("rohit", "project manager", 12, 55000, 5));
		a1.add(new Employee("suresh", "irrigation", 55, 62000, 5));
		a1.add(new Employee("kumar", "Power department", 18, 50000, 5));
		
		a1.stream().filter(Employee -> Employee.exp > 5&& Employee.salary > 20000&& Employee.department=="account")
		.forEach(Employee -> System.out.println(Employee.name+" "+Employee.department+" "+Employee.id+" "+Employee.salary+" "+Employee.exp));

	}

}
