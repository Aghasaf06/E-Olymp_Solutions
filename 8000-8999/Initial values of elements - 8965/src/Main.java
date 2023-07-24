import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        min /= 2;

        for (int i : arr) {
            System.out.print(i - min + " ");
        }
    }
}