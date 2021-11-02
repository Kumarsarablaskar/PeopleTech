package oct21Array2;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		QuickSort k=new QuickSort();
		int arr[] = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
		System.out.println(Arrays.toString(arr));
		k.quicksort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void swap(int arr[],int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}
	

	private void quicksort(int[] arr) {
		quickSort(arr, 0,arr.length-1);
		
		
	}
	

	private void quickSort(int[] arr, int low, int high) {
		if(low<high+1) {
			int p=partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
			
		}
		
	}

	private int partition(int[] arr, int low, int high) {
		swap(arr,low,getpivot(low,high));
		int border=low+1;
		for(int i=border;i<=high;i++) {
			if(arr[i]<arr[low]) {
				swap(arr,i,border++);
			}
		}
		swap(arr,low,border-1);
		
		return border-1;
	}

	private int getpivot(int low, int high) {
		Random rand=new Random();
		return rand.nextInt((high-low)+1)+low;
	}

}
