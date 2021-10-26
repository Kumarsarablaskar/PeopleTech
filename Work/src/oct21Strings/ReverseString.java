package oct21Strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println(ch);
		
	}
}
