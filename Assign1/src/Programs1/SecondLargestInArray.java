package Programs1;
public class SecondLargestInArray{  
      public static int getSecondLargest(int[] a, int total){  
          int temp;  
          for (int i = 0; i < total; i++){  
            for (int j = i + 1; j < total; j++){  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
         }  
       return a[total-2];  
     }  
     public static void main(String args[]){  
        
      int a[]={87,12,5,81,54,58,9};  
       
      System.out.println("Second Largest: "+getSecondLargest(a,7));  
     }
}  //44,66,99,77,33,22,55