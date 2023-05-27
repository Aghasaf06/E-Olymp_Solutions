import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        double d = Math.sqrt(n);

        n = (int) d;

        System.out.println((int) Math.pow(n + 1, 2));
    }
}