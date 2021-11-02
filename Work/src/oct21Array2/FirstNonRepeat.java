package oct21Array2;

import java.util.Arrays;

public class FirstNonRepeat {

	public static void main(String[] args) {
		int[] arr = { 24, 15, 89, 12, 15, 24 };
		int output =nonRepeat(arr);
		System.out.println("First non repeat element is: "+output);

	}

	private static int nonRepeat(int[] arr) {
		System.out.println("Input array");
		System.out.println(Arrays.toString(arr));

		int len = arr.length;
		System.out.println("length of input array is: " + len);
		for (int i = 0; i < len; i++) {
			int j;
			for (j = 0; j <len; j++) {
				if (i!=j && arr[i] == arr[j]) {
					//System.out.println("Element matched");
					break;
				}
			}
			if(j==len) {
				return arr[i];
			}

		}
		return -1;

	}
}
