import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] digits = new int[5];
        for(int i = 4; 0 <= i; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        n = 0;
        int d = 10000;

        for(int i : digits) {
            if(i % 2 == 0) n += (i + 1) * d;
            else n += i * d;

            d /= 10;
        }

        System.out.println(n);
    }
}