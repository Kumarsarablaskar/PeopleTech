package oct21Array2;

public class PairOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int sum = 5;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int sum1 = arr[i] + arr[j];

				if (sum == sum1) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}

		}
	}
}
