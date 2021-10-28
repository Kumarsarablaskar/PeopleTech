package oct21Array2;

import java.util.HashSet;

public class SubArray {
	public static void main(String[] args) {
		int[] arr = { 2, 1, -3, 4, -2 };
		boolean found = false;
//		for (int i = 0; i < arr.length; i++) {
//			int sum = 0;
//			for (int j = i; j < arr.length; j++) {
//				sum =sum+ arr[j];
//				if (sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if (found)
//				break;
//		}

		HashSet<Integer> set = new HashSet<>();
		int sum = 0;
		for (int element : arr) {
			set.add(sum);
			sum += element;
			if (set.contains(sum)) {
				found = true;
				break;
			}
		}

		System.out.println("found " + found);
	}
}
