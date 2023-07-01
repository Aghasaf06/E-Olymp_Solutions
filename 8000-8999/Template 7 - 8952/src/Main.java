import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i < n / 2) {
                    if (n / 2 - i <= j && j <= n / 2 + i) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    if (n / 2 - (n - i - 1) <= j && j <= n / 2 + (n - i - 1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.print("\n");
        }
    }
}