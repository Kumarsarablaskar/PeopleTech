package Programs1;

public class Factorof250 {
    public static void main(String[] args) {
	         int num = 250;
     System.out.print("Factors of 250 are: ");
		    for (int i = 1; i <= num; i++) {
		      if (num % i == 0) {
		        System.out.print(i + " ");
		      }
		    }
    }
}

