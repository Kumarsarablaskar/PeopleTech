package com.peopletech.array;

public class MaxMinArray {

	public static void main(String[] args) {

		int arr[]= {50,34,67,23,89};
		for(int i=0;i<arr.length;i++) {
		    for(int j=i;j<arr.length;j++){
		       int temp;
		        if(arr[i]>arr[j]) {
		          temp=arr[i];
		          arr[i]=arr[j];
		          arr[j]=temp;
		        }
		    }
		   System.out.println(arr[i]+" ");
	     }
		 System.out.println("min array "+arr[0]);
		   int max=arr.length-1;
		 System.out.println("max array "+ arr[max]);
	}

}