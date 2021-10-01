package Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str =sc.next();
		String str1 ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			str1=str1+str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1))
		{

		System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
	}
	}

}
