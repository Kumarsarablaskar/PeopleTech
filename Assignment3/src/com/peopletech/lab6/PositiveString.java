package com.peopletech.lab6;

import java.util.Scanner;

public class PositiveString {
 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String s = scan.next();
		s = s.toLowerCase();
		System.out.println(checkPositive(s));
		//System.out.println("given string is positive string");
		
	}
 private static boolean checkPositive(String s) {
		char ch[] = s.toCharArray();
		//boolean flag = true;
		for (int i=0; i<ch.length-1; i++) {
			
			if(ch[i] > ch[i+1]) {
				
				System.out.println("not a positive String ");
				return false;
				
			}
			
		}
		
		return true;
	
	}

}