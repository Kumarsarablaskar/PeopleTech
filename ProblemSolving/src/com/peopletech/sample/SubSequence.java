package com.peopletech.sample;

import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
      int arr[]= {3,5,2,9,8,7,10};
       Arrays.sort(arr);
      System.out.println("The sorted array ");
      for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
      }
      int length =arr.length/2;
      System.out.println("\n The sub sequence ");

      for(int i=length;i<arr.length;i++) {
          System.out.print(arr[i]+" ");
      }
   }

}
