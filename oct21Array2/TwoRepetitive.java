package oct21Array2;

import java.util.HashSet;

public class TwoRepetitive {
	public static void main(String[] args) {
     int[] arr= {1,5,9,3,4,9,2,7,3,2};
     System.out.println("The Repetitive Elements are: ");
//     for(int i=0;i<arr.length;i++) {
//    	 for(int j=i+1;j<arr.length;j++) {
//    		 if(arr[i]==arr[j] && (i!=j)) {
//    			 System.out.println(arr[i]+" ");
//    		 }
//    	 }
//     }
		
		HashSet<Integer> set=new HashSet<>();
		for(int elements : arr) {
			if(set.add(elements)==false) {
				System.out.println(elements+" ");
			}
		}
		
		
	}
}
