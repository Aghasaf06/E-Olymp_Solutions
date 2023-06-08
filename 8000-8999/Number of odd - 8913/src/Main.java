import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, count = 0;

        while (0 != (n = scan.nextInt())) {
            if (n % 2 != 0) count++;
        }

        System.out.println(count);
    }
}