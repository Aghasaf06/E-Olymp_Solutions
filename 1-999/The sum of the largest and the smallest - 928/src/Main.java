import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = scan.nextInt();
        Arrays.sort(array);

        System.out.print(array[0] + array[n - 1]);
    }
}