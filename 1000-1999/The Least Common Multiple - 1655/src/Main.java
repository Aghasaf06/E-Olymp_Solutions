import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static BigInteger LCM(BigInteger a, BigInteger b){
        BigInteger c = a.gcd(b);
        return a.multiply(b.divide(c));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i;

        n = s.nextInt();
        BigInteger res = BigInteger.ONE;

        for(i = 1; i <= n; i++){
            BigInteger a = BigInteger.valueOf(i);
            res = LCM(res, a);
        }

        System.out.println(res);
    }
}