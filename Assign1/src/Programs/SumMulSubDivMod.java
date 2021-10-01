package Programs;

import java.util.Scanner;

public class SumMulSubDivMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number :");
		int a =sc.nextInt();
		System.out.println("Enter second number :");
		int b =sc.nextInt();
		
		int c =a+b;
		System.out.println("Sum of two numbers :" + c);
		 int d =a-b;
		 System.out.println("Substraction of two numbers :" + d);
		 int m=a*b;
		System.out.println("Multiplication of two numbers :" + m);
		 int n=a/b;
	     System.out.println("Divide of two numbers :" + n);
		 int p =a%b;
		System.out.println("Mod of two numbers :" + p);
				 
	}

}