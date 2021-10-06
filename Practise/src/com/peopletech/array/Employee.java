package com.peopletech.array;

import java.util.*;  
import java.io.*;  
class  Employee implements Comparable<Employee>{  
	int id;
    String name;
    int age;
    int salary;

public Employee(int id, String name, int age, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}
public int compareTo(Employee st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  
}  

