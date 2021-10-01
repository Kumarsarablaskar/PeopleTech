package com.peopletech.lab3;

import java.util.Scanner;

public class CountArray {
	 static final int MAX_CHAR = 256; 
     public static void getCountChar(String str){ 
      int count[] = new int[MAX_CHAR]; 
       for (int i = 0; i < str.length(); i++) 
         count[str.charAt(i)]++; 
         char ch[] = new char[str.length()]; 
       for (int i = 0; i < str.length(); i++) { 
         ch[i] = str.charAt(i); 
         int occur = 0; 
        for (int j = 0; j <= i; j++){ 
          if (str.charAt(i) == ch[j]) 
          occur++; 
        } 
       if (occur == 1) 
       System.out.println("Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]); 
      } 

	} 
    public static void main(String[] args){ 
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the String :"); 
        String str =sc.nextLine(); 
         getCountChar(str); 
    } 

}