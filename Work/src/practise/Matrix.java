package practise;

public class Matrix {
	public static int[][] rotateMatClock(int arr[][]) {
		 
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
 
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
 
            rev(arr[i]);
        }
        return arr;
    }
 
    public static void rev(int arr[]) {
 
        int i = 0, j = arr.length - 1;
        while (i < j) {
 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
 
    }
 
    public static void main(String[] args) {
 
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("after rotation");
        rotateMatClock(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
 
        }
    }
}