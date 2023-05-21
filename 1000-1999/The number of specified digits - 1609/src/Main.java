import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int a = scan.nextInt();

        if(n < 0) n = -n;

        int i = 0;
        while(n > 0) {
            if(n % 10 == a) i++;
            n /= 10;
        }

        System.out.print(i);
        scan.close();
    }
}