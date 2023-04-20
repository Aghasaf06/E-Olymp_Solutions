import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        if(n >= m)
            System.out.println(0);
        else{
            long f = 1;
            for (int i=1;i<=n;i++)
                f=((f%m) * (i%m)) % m;
            System.out.println(f);
        }
    }
}