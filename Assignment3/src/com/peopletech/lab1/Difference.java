package com.peopletech.lab1;

  public class Difference {

	   public static int calculateDifference(int n) {
	    int squareOfSum=0,sumofSquare=0 ;
	     for(int i=1;i<=n;i++) {
	     squareOfSum+=i;
	     sumofSquare+=(i*i); 
	     }
	    
	    System.out.println("squares of sum "+(squareOfSum*squareOfSum));
	    System.out.println("sum of squares "+sumofSquare);
	   int diff=(squareOfSum*squareOfSum)-(sumofSquare);
	    return diff;
	   }
	 public static void main(String[] args) {
	    System.out.println(calculateDifference(3));
	 }

  }
