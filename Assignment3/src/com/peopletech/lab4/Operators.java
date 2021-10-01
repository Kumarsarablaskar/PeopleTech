package com.peopletech.lab4;

import java.util.Scanner;

public class Operators {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
        int n = scan.nextInt();
       
        System.out.println("sum of cube = "+sumOfCubes(n));
	}
	
	static int sumOfCubes(int n) {
        
        int sum = 0;
         while (n>0){
            int s = n%10;
            n = n/10;
            sum += s*s*s;
         }
        
        return sum;
    }
		
}