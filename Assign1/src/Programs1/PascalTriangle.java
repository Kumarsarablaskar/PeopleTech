package Programs1;

import java.util.Scanner;
  
   public class PascalTriangle {
		public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the no lines :");
			int n =scan.nextInt();
			int  spaces =n;
			int num=1;
			for(int i=0;i<n;i++) {
				for(int s=1;s<=spaces;s++) {
					System.out.print(" ");
				}
				num =1;
				for(int j=0;j<=i;j++) {
					
					System.out.print(num+" ");
					num =num*(i-j)/(j+1);	
				}
				spaces--;
				System.out.println();
			}	
		}
	}
