package oct21;

public class Occurance {
	public static void main(String[] args) {
		int arr[] = { 1, 55, 2, 6, 5, 9, 6, 6, 8 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 6) {
				count++;
			}
		}
		System.out.println("Count of 6 is: " + count);
	}
}
