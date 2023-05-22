import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(2);
        } else {
            int count = 2;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) count++;
            }

            System.out.println(count);
        }

    }
}