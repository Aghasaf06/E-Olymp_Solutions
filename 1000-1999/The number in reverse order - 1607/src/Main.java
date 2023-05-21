import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        long[] arr = new long[64];

        if(n < 0) n = -n;

        if(n == 0) System.out.println(n);

        int i = 0;
        while(n > 0) {
            arr[i] = n % 10;
            n /= 10;
            i++;
        }

        for(int j = 0; j < i; j++)
            System.out.print(arr[j]);

        scan.close();
    }
}