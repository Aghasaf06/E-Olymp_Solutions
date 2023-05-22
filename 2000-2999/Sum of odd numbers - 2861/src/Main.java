import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        long sum = 0;

        if(a % 2 == 0) a = a + 1;

        for(int i = a; i <= b; i+=2) sum += i;

        System.out.println(sum);
        scan.close();
    }
}