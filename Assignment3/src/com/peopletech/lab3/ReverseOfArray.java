package com.peopletech.lab3;

public class ReverseOfArray {
 public static void main(String[] args) {
	int arr[] = new int[] {85,42,25,75,10,9,31}; 
	int temp = 0; 
	System.out.println("Original Array:"); 
	for (int i = 0; i < arr.length; i++) { 
		System.out.print(arr[i] + " "); 
	} 
	for (int i = 0; i <= arr.length; i++) { 
		for (int j = i + 1; j < arr.length; j++) { 
			if (arr[i] > arr[j]) { 
				temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 
	} 
	System.out.println("\nAfter Sorting:"); 
	for (int i = 0; i < arr.length; i++) { 
		System.out.print(arr[i] + " "); 
	} 
 } 
}