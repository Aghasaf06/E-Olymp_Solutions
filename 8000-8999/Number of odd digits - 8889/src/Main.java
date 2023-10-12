import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int odd = 0;

        for(int i = 0; i < 5; i++) {
            if((n % 10) % 2 == 1) odd++;
            n /= 10;
        }

        System.out.println(odd);
    }
}