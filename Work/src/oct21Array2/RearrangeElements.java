package oct21Array2;

import java.util.Scanner;

public class RearrangeElements {
	public void arrange(int arr[], int n) {
		int i = -1;
		for (int j = 0; j <= n; j++) {
			if (arr[j] < 0) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int pos = i + 1, neg = 0;

		while (neg < pos && pos < n && arr[neg] < 0) {
			int temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			neg += 2;
			pos++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements of an array");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		RearrangeElements re = new RearrangeElements();
		re.arrange(arr, arr.length - 1);

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}
}
