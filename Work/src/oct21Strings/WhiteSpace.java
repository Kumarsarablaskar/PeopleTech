package oct21Strings;

import java.util.Scanner;

public class WhiteSpace {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String: ");
     String str=sc.nextLine();
     System.out.println("Original String: "+str);
     str=str.replaceAll("\\s", "");
     System.out.println("Final String: "+str);
	}
}
