package Programs;

import java.util.Scanner;

public class Fibanocci {
	
	public static int evenFibSum(int limit) {
		int sum = 0;
		int a=0, b=1, c;
		
		for(int i=1; i<=limit; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			if(c%2==0) {
				sum+=c;
			}
		}
		System.out.println();
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit = sc.nextInt();
		System.out.println(evenFibSum(limit));
		
	}

}
