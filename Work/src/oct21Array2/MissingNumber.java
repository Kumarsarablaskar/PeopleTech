package oct21Array2;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		//System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 6; j++) {
			sum1 = sum1 + j;

		}
		//System.out.println(sum1);
		System.out.println("mising number is: " + (sum1 - sum));
	}
}