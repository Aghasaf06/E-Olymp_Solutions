import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();

        int i = 1;

        while (Math.pow(2, i) < n + 1) i++;

        System.out.println((long) Math.pow(2, i));
    }
}