package oct21;

public class ReverseArray {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 *
		 * System.out.println("Enter the Size"); int size = sc.nextInt(); int arr[] =
		 * new int[size]; System.out.println("Enter the Array ");
		 *
		 * for(int i=0;i<=arr.length-1;i++) { arr[i] = sc.nextInt();
		 * System.out.print(arr[i]+" "); } System.out.println(); for(int
		 * i=arr.length-1;i>=0;i--) {
		 *
		 * System.out.print(arr[i]+" "); }
		 */
		int[] arr = { 1, 2, 3, 4, 5 };

		int a[] = reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	private static int[] reverse(int a[]) {
		int i = 0, j = a.length - 1;
		while (i <= j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}

		return (a);

	}

}