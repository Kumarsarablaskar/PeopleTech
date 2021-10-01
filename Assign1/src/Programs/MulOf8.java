package Programs;

import java.util.Scanner;

public class MulOf8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		    Scanner sc =new Scanner(System.in);
			 System.out.println("Enter the number :");
			 int a =sc.nextInt();
			 
			 for(int i =1;i<=10;i++) {
				
				 
				 int c=a*i;
				 System.out.println(a +"x"+i+"="+c );
				 
			 }
	}

}