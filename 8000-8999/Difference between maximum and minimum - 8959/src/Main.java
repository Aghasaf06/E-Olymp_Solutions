import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int min = 100, max = -100;

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();

            if (a > max)
                max = a;

            if (a < min)
                min = a;
        }

        System.out.println(max - min);
    }
}