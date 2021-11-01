package oct21Array1;

import java.util.Arrays;

public class Negative {
	public static void main(String[] args) {
		int[] arr = { -5, 5, -9, 28, 3, 7, -22, 25 };
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] < 0) {
				start++;
			} else if (arr[end] > 0) {
				end--;

			} else {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;

			}
		}

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print(arr[i] + " ");
		}

	}
}
