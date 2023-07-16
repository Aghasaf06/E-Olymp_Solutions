import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        arr[index] = arr[0];
        arr[0] = min;

        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}