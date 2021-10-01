package com.peopletech.array;

public class CountOf20 {
      
       private static int count(int[] a) {
              int count = 0;
			for(int i=0; i<a.length; i++) {
				if(a[i] == 20) {
					count++;
				}
			}
			return count;
	   }
	 public static void main(String[] args) {
	     int a[] = {10,30,20,40,20,50,80,20,90};
		    System.out.println("Count of 20 is: "+count(a));
				
	}
}