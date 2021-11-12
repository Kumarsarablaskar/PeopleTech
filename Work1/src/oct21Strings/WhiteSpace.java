package oct21Strings;

import java.util.Scanner;

public class WhiteSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("The String is:" + str);
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			}
			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);

	}
}
