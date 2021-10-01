package com.peopletech.lab1;

public class Powerof2 {
	public static boolean checkNumber(int n){
	 while(n%2==0){
	   n=n/2;
	 }
	 if(n==1){
	   return true;
	 }
	 else{
	   return false;
	 }
	}
	public static void main(String[] args) {
		
		System.out.println(checkNumber(8));

	}

}
