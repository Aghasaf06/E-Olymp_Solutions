import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a > b) scoreA++;
            if (b > a) scoreB++;
        }

        if (scoreA > scoreB) System.out.println(1);
        if (scoreA < scoreB) System.out.println(2);
        if (scoreA == scoreB) System.out.println(0);
    }
}