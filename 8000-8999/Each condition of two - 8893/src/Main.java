import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int length = Integer.toString(abs(n)).length();

        if(length == 2 && n % 6 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}