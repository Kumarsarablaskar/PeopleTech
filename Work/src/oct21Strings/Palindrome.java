package oct21Strings;

public class Palindrome {
	public static void main(String[] args) {
		String str1 = "lol";
		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; --i) {
			str2 = str2 + str1.charAt(i);
		}
		 if (str1.equals(str2)) {
	            System.out.println("It is a palindrome");
	        } else {
	            System.out.println("It is not a palindrome");
	        }
	}
}
