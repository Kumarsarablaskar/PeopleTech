package oct21Array2;

import java.util.HashSet;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 8, 9, 7, 2, 2, 5 };

		HashSet<Integer> k = new HashSet<Integer>();
		System.out.println("Duplicate elements are");
		for (int b : arr) {
			if (k.add(b) == false) {
				System.out.println(b);
			}
		}

		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i]==arr[j]) { System.out.println(arr[i]+" ");
		 * 
		 * } } }
		 */
	}
}
