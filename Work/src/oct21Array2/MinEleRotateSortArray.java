package oct21Array2;

public class MinEleRotateSortArray {
	public static void main(String[] args) {
		int[] arr= {25,67,32,964,246,12,39,21};
		int n=arr.length;
		minElement(arr,0,n-1);
		
	}

	 static void minElement(int[] arr, int i, int j) {
		while(i<j) {
			int mid=i+(j-i)/2;
			if(arr[mid] ==arr[j])
				j--;
			else if(arr[mid]>arr[j])
				i=mid+1;
			else
				j=mid;
		}
		System.out.println("The Minimum elements is "+ arr[j]);
		
	}
}
