import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int  a = n / 100;
        int c = n % 10;
        if(a > c)
            System.out.println(a);
        else if(a < c)
            System.out.println(c);
        else
            System.out.println("=");
        scan.close();
    }
}