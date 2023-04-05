import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger factorial = new BigInteger("1");
        for(int i = 1; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        System.out.println(factorial);
    }
}