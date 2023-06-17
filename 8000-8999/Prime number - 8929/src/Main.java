import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        boolean condition = true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                condition = false;
                System.out.println(0);
                break;
            }
        }

        if (condition) System.out.println(1);
    }
}