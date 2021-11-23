import java.math.*;

public class BinCoeff {
    public static void main(String[] args){
    
    System.out.print(BinCoeff.factorial(20));

    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }



}
