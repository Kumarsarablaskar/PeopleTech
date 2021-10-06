package com.peopletech.array;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {  
public static void main(String args[]){  
ArrayList<Employee> al=new ArrayList<Employee>();  
al.add(new Employee(101,"Vijay",23,6000));  
al.add(new Employee(106,"Ajay",27,5000));  
al.add(new Employee(105,"Jai",21,9000));  
  
Collections.sort(al);  
for(Employee st:al){  
System.out.println(st.id+" "+st.name+" "+st.age+" "+st.salary);  
}  
}  
}  