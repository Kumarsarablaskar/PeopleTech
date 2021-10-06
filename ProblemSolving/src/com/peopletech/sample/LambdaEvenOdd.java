package com.peopletech.sample;

import java.util.HashSet;

public class LambdaEvenOdd { 
   public static void main(String[] args){ 
   HashSet<Integer> k=new HashSet<>(); 
       k.add(9); 
       k.add(14);
       k.add(25);
       k.add(7);
       k.add(5);
       k.add(58);

		 System.out.println(k); 
        k.forEach((x)->{if (x%2==0) 

		 System.out.println("Even Numbers :"+x); 

		 else 

		 System.out.println("Odd Numbers :"+x);}); 
  } 
} 