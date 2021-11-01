package oct21Array2;

public class LargestThree {
	public static void main(String[] args) {
		int arr[] = { 10, 4, 3, 50, 23, 90 };
		lar(arr);
		for (int i = arr.length - 1; i >= 3; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	static void lar(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

/*
 * public static void main(String[] args) { int[] arr= {89,5,10,15,25,54}; int
 * n=arr.length; threeLargest(arr,n);
 * 
 * }
 * 
 * private static void threeLargest(int[] arr, int n) { int
 * firstlargest,secondlargest,thirdlargest;
 * firstlargest=secondlargest=thirdlargest=arr[0]; for(int i=1;i<n;i++) {
 * if(arr[i]>firstlargest) { thirdlargest=secondlargest;
 * secondlargest=firstlargest; firstlargest=arr[i]; } else
 * if(arr[i]>secondlargest) { thirdlargest=secondlargest; secondlargest=arr[i];
 * } } System.out.println(firstlargest+" "+secondlargest+" "+thirdlargest); } }
 */
