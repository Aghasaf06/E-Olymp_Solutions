import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int result;

        if(m % n == 0) result = m / n;
        else result = m / n + 1;

        System.out.println(result);
        scan.close();
    }
}