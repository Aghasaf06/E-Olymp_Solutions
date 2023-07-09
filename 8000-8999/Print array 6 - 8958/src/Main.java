import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n < 2) {
            System.out.println("NO");
        }
        else {
            System.out.println(n / 2);

            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();

                if (i % 2 == 1)
                    System.out.print(a + " ");
            }
        }
    }
}