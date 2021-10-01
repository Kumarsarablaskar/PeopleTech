package com.peopletech.lab5;

import java.util.Scanner;

public class Fibbo {
	
	 public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = scan.nextInt();
		int a = 0, b=1;
		System.out.println("The Fibonacci Series without recursion: ");
		noRecursuin(a,b,n);
		System.out.println();
		System.out.println("The Fibonacci Series with recursion: ");
		recursion(a,b,n-2);	
	}
	
	static void noRecursuin(int a, int b,int n){
		
		int sum = 0;
		for (int i=2; i<n; i++){
			sum = a+b;
			System.out.print(sum+" ");
			a = b;
			b = sum;
		}
		
		
	}
	static void recursion(int a,  int b, int n){
		int sum = 0;
		if(n > 0){
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum+" ");
			recursion(a,b,n-1);
		}
		
	}
	
}