import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

            if (i == 0){
                System.out.print(arr[i] + " ");
                continue;
            }

            System.out.print(arr[i] - arr[i -1] + " ");
        }
    }
}