package com.peopletech.sample;

import java.util.ArrayList;
import java.util.List;

public class Employee {
 String firstName; 
 String lastName; 
 int yearsOfExp; 
 int pay; 
  String dept; 
  String location; 
   public Employee(String firstName, String lastName, int yearsOfExp, int pay, String dept, String location) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.yearsOfExp = yearsOfExp;
	this.pay = pay;
	this.dept = dept;
	this.location = location;
  }
	 public static void main(String[] args) { 
       List<Employee> k = new ArrayList<Employee>();   
       k.add(new Employee("Kumar", "Sarablaskar",5,42000,"Developer","Hyderabad")); 
       k.add(new Employee("Shreyas", "Kasoju",4,28000,"Account","Bangalore")); 
       k.add(new Employee("Sai", "Teja",8,36500,"Hr","Chennai")); 
       k.add(new Employee("Raghu", "Arepuri",3,250000,"CEO","USA")); 
       k.add(new Employee("Naresh", "Bobbala",9,50000,"Manager","Pune")); 
       
       
       k.stream().filter(Employee ->Employee.yearsOfExp<=6 && Employee.pay>20000 && Employee.dept=="Account") 
      .forEach(Employee -> System.out.println(Employee.firstName +" "+Employee.lastName+" "+Employee.pay+" "+Employee.yearsOfExp+" "+Employee.dept));     

	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", yearsOfExp=" + yearsOfExp + ", pay=" + pay
				+ ", dept=" + dept + ", location=" + location + "]";
	} 
}
