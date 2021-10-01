package Programs1;

public class LargestArray{ 
    public static void main(String[] args) {  
   
        int [] arr = new int [] {25, 11, 7, 56,75};  
       
        int max= arr[0];
       
        for (int i = 0; i < arr.length; i++) {  
         
           if(arr[i] > max)  
        	   max = arr[i];  
        }  
        System.out.println("Largest element in array: " + max);  
    }  
}  
