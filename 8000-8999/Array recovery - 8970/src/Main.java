import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n - n / 2];
        int[] arr2 = new int[n];

        for (int i = 0; i < n - n / 2; i++) {
            arr1[i] = scan.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            arr2[i] = scan.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr1[i] + " " );
            System.out.print(arr2[i] + " " );
        }

        if (n % 2 == 1) System.out.println(arr1[n - n / 2 - 1]);
    }
}