import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        if (a != b && a != c && b != c) System.out.println("YES");
        else System.out.println("NO");
    }
}