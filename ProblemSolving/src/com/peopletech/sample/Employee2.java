package com.peopletech.sample;

import java.util.ArrayList;
import java.util.List;

public class Employee2 {
   String firstName,lastName; 
   int yearsOfExp, pay; 
   String dept, location; 
   
 public Employee2(String firstName, String lastName, int yearsOfExp, int pay, String dept, String location) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.yearsOfExp = yearsOfExp;
	this.pay = pay;
	this.dept = dept;
	this.location = location;
 }
  public static void main(String[] args) { 
  List<Employee2> k = new ArrayList<Employee2>();   
  k.add(new Employee2("Kumar", "Sarablaskar",5,42000,"Developer","Hyderabad")); 
  k.add(new Employee2("Shreyas", "Kasoju",4,28000,"Account","Bangalore")); 
  k.add(new Employee2("Sai", "Teja",8,36500,"Hr","Chennai")); 
  k.add(new Employee2("Raghu", "Arepuri",3,250000,"CEO","USA")); 
  k.add(new Employee2("Naresh", "Bobbala",9,65000,"Manager","Pune")); 

   System.out.println("<------Employee list from Location Hyderabad------>"); 

   k.stream().filter(Employee2 ->Employee2.yearsOfExp>=4 && Employee2.location=="Hyderabad" && Employee2.dept!="Java") 
   .forEach(Employee2 -> System.out.println(Employee2.firstName +" "+Employee2.lastName+" "+Employee2.pay+" "+Employee2.yearsOfExp+" "+Employee2.dept)); 

}
@Override
public String toString() {
	return "Employee2 [firstName=" + firstName + ", lastName=" + lastName + ", yearsOfExp=" + yearsOfExp + ", pay=" + pay + ", dept="
			+ dept + ", location=" + location + "]";
} 

} 
