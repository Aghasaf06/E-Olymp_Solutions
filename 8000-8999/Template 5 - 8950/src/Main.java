import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++)
        {

            for (int j = 0; j < n; j++)
            {

                if (i < n / 2)
                {

                    if (j <= i || n - i - 1 <= j) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                else
                {

                    if (j < n - i || i <= j) {
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