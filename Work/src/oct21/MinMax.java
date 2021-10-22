package oct21;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			System.out.print(arr[i] + " ");

		}
		System.out.println();
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Max Element in array: " + max);
		System.out.println("Min Element in array: " + min);
	}
}
