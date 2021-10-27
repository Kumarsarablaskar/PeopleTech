package oct21Array1;

import java.util.Arrays;

public class KthLargSmal {
	public static void main(String[] args) {
		int[] arr = { 1, 6, 88, 5, 33, 2 };
		int k = 3;
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println("Kth Smallest: " + arr[k - 1]);
		System.out.println("Kth Largest: " + arr[n - k]);
	}
}
