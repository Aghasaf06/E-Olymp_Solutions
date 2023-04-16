import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int j = 0;
        for(int i = 1; i < n; i++){
            if(n / i == n % i)
                j++;
        }

        System.out.println(j);
        scan.close();
    }
}