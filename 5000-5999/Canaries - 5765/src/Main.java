import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int min;

        if(n % k == 0) min = n / k;
        else min = n / k + 1;

        int max = n - k + 1;

        System.out.println(min + " " + max);

        scan.close();
    }
}