import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] array = new int[n];

        for(int i = n - 1; 0 <= i; i--){
            array[i] = scan.nextInt();
        }

        for(int i : array)
            System.out.print(i + " ");
    }
}