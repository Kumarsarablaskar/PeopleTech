package com.peopletech.linkedlists;

public class MissingNumber {
         public static int getMissingNumber(int arr[]){
	        int i, total ;
	        int n = arr.length;
	        total = (n + 1) * (n + 2) / 2;
	        for (i = 0; i < n; i++)
	        	total -= arr[i];
	        return total ;
	    }
	    
	    
	    public static void main(String[] args) {
	        int[] number = {3, 7, 6, 1, 8, 5 ,4};
	        System.out.println("Missing Number is: " + getMissingNumber(number));
	    }
	    
	}