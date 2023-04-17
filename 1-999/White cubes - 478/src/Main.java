import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();

        long n = a * b * c;
        long s = ((a -1) * b * c) + (a * (b -1) * c) + (a * b * (c - 1));
        System.out.println(n + " " + s * 2);
        scan.close();
    }
}