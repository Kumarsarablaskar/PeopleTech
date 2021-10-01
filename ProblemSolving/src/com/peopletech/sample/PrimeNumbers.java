package com.peopletech.sample;

import java.util.Scanner;

public class PrimeNumbers {

   public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=s.nextInt();
    System.out.println("Prime Numbers from 2 to "+n);
    for(int i=2;i<n;i++) {
       boolean isPrime=true;
       for(int j=2;j<i;j++) {
           if(i%j==0) {
             isPrime=false;
             break;
            }
       }
       if(isPrime)
      System.out.println(i+" ");
    }
  }
}
