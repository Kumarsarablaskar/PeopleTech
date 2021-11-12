package oct21Array2;

public class CyclicallyRotate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int temp = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {

			arr[i + 1] = arr[i];

		}
		arr[0] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
