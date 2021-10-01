package com.peopletech.lab1;

public class SumOfN {
 
	public static void main(String[] args) {
		int result=calculateSum(10);
	     System.out.println("Sum of First 10 Natural Numbers are div by 3 & 5 is = " + result);
   }  
	    
	public static int calculateSum(int n) {
        int i, sum = 0;  
  	    for(i = 1; i <= n; i++)  
  	     {  
  	     if(i%3==0||i%5==0) {
  	    	 sum = sum + i;  
  	     }
  	    }
    return sum;
    }
}