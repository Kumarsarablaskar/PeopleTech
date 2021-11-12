package oct21Array2;

import java.util.HashSet;

public class Intersection {
	public static void main(String[] args) {
		int[] firstArr = { 1, 2, 3, 4, 5, 6, 15 };
		int[] secondArr = { 4, 9, 13, 15, 16, 17 };
		// findIntersection(firstArr, secondArr);

		/*
		 * private static void findIntersection(int[] firstArr, int[] secondArr) { int i
		 * = 0; int j = 0; while (i < firstArr.length && j < secondArr.length) { if
		 * (firstArr[i] < secondArr[j]) { i++; } else if (firstArr[i] > secondArr[j]) {
		 * j++; } else { System.out.print(firstArr[i] + " "); i++; j++; } }
		 * 
		 * }
		 */

		HashSet<Integer> set1 = new HashSet<>();
		for (int val : firstArr) {
			set1.add(val);
		}
		for (int val : secondArr) {
			if (set1.contains(val)) {
				System.out.println(val);
			}
		}
	}
}
