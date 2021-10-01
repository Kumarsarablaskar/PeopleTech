package com.peopletech.array;

public class ReverseOfArray {
		public static void main(String[] args) {
		  int arr[]={ 12,34,67,89,76};
		   System.out.println("Originall array");
		  for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
		  }
		  System.out.println("\nReversed array ");
		  for(int i=arr.length;i>0;i--) {
		   System.out.print(arr[i-1]+" ");
		  }
	    }
}