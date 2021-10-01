package Programs1;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int count=0;
		int a=1;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			if(i%2!=0) {
				count+=8;
			}
			int next=a+count;
			a=next;
		}
		
		

	}

}
