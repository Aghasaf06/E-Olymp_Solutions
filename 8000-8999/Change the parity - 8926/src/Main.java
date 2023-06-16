import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0, divisor, t = 1;
        while (0 < n) {
            divisor = n % 10;
            if (divisor % 2 == 0) result += t * (++divisor);
            else result += t * (--divisor);
            t *= 10;
            n /= 10;
        }
        System.out.println(result);
    }
}