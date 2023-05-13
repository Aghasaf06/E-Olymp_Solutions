import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Long a = scan.nextLong();
        Long b = scan.nextLong();

        System.out.println(a * a + b * b);

        scan.close();
    }
}