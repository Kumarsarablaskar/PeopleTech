package recursion;

import java.util.Scanner;

public class Palindrome {

	public static int palin(int num, int sum) {
		if(num==0)
			return sum;
		sum=(sum*10)+(num%10);
		return palin(num/10,sum);
		
	}

	public static void main(String[] args) {
		int num,sum=0,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		p=palin(num,sum);
		if(num==p)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}
}
