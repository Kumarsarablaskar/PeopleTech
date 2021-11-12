package oct21Array2;

import java.util.HashSet;

public class FirstRepeating {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 9, 7, 6, 8, 22, 25, 8, 9 };
		// duplicateElement(arr);

		// }

		/*
		 * private static void duplicateElement(int []arr) { for(int
		 * i=0;i<arr.length-1;i++) { int temp=0; for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i]==arr[j]) {
		 * System.out.println("First duplicate element is: "+arr[i]); temp++; break; } }
		 * if(temp>0) { break; } }
		 */
		int   temp = -1;
		HashSet<Integer> hs = new HashSet<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (hs.contains(arr[i])) {
				temp = i;
			} else {
				hs.add(arr[i]);
			}
		}
		if(temp!=-1) {
			System.out.println("First duplicate element is: "+arr[temp]);
		}
		else {
			System.out.println(" No first duplicate element is found ");
		}
	}
}
