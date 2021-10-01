package com.peopletech.lab3;

import java.util.Arrays;

public class UpperLower {
   public static void main(String[] args) {
      String str[] = {"kumar","shreyas","santhosh","naresh","teja"};
      Arrays.sort(str);
      System.out.println("Sorted of array ");
    for(int i=0;i<str.length;i++) {
     System.out.print(str[i]+" ");
    }
    int mid=(str.length)/2;
    System.out.println("\nResult of array");
    for(int i=0;i<=mid;i++) {
     System.out.print(str[i].toUpperCase()+" ");
    }
    for(int i=mid+1;i<str.length;i++) {
      System.out.print(str[i].toLowerCase()+" ");
    }
  }

}
