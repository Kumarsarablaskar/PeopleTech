package recursion;

public class ReverseString {
      public static void reverse(int num) {
    	  if(num<10) {
    		  System.out.println(num);
    		  return;
    	  }
    	  else {
    		  System.out.print(num%10);
    		  reverse(num/10);
    	  }
      }
	public static void main(String[] args) {
		reverse(1235);
		reverse(1212);
	}
}
