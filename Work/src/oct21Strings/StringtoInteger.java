package oct21Strings;

public class StringtoInteger {
	public static void main(String[] args) {
		String str = "10";
		int b = Integer.parseInt(str);
		/**
		 * int b = Integer.valueOf(str);
		 */
		System.out.println(b);

		int a = 10;
		String str1 = Integer.toString(a);
		System.out.println(str1);
	}
}
