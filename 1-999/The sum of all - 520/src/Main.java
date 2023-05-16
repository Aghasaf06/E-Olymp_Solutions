import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        while(scan.hasNext())
            sum += scan.nextInt();
        System.out.println(sum);
        scan.close();
    }
}