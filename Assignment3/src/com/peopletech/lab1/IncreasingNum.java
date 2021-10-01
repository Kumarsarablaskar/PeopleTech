package com.peopletech.lab1;

import java.util.Scanner;

public class IncreasingNum {


	public static void main(String[] args) {
		
		System.out.println("enter the number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(checkNumber(n));
	}
	
	
	

	private static boolean checkNumber(int n) {
		
		while(n > 0) {
		 int ft = n % 10;
		 n = n/10;
		 int st = n % 10;
		 if (ft < st) {
		  return false;
		 }
	    }
		return true;
	}

}
