package com.peopletech.lab6;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfInt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, sum=0;
		System.out.println("enter the integers ");
		String s = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s);
	     while (st.hasMoreTokens()) {  
	         
	         num = Integer.parseInt(st.nextToken(" "));
	         System.out.println(num);
	         sum += num;
	     }  
	     System.out.println("sum of all integers is: " + sum);
	}

}
