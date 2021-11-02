package oct21Array2;

import java.math.BigInteger;

public class LargestFactorial {
   public static void main(String[] args) {
    int number = 55;
    BigInteger fact = BigInteger.ONE;
    for(int i =1;i<=number;i++)
    {
        fact = fact.multiply(BigInteger.valueOf(i));
    }
    System.out.println("The factorial of the number is: " + "\n"+fact);
}
}
