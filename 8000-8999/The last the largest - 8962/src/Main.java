import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();

        for (int i = n - 1; 0 <= i; i--) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        arr[index] = arr[n -1];
        arr[n -1] = max;

        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}