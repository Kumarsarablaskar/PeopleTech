package oct21Array2;

public class ThreeSortedArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 9, 12, 45, 85, 96, 745 };
		int[] arr2 = { 2, 4, 7, 8, 9,12, 18, 45,54, 65, 98 };
		int[] arr3 = { 2,9,12, 15, 19, 25, 75, 82, 90 };
		commonElements(arr1, arr2, arr3);

	}

	static void commonElements(int arr1[], int arr2[], int arr3[]) {
		int x = 0, y = 0, z = 0;
		while (x < arr1.length && y < arr2.length && z < arr3.length) {
			if(arr1[x] == arr2[y] && arr2[y]==arr3[z] ) {
				System.out.println(arr1[x]);
				x++;
				y++;
				z++;
			}
			else if(arr1[x]>arr2[y]) {
				y++;
			}
			else if(arr2[y]>arr3[z]) {
				z++;
			}
			else
				x++;
		}

	}

}
