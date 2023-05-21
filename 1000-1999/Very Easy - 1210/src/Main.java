import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        long a = scan.nextInt();
        long sum = 0;

        if(a > 1){
            for(int i = 1; i <= n; i++){
                sum += i * Math.pow(a, i);
            }
        }
        else{
            sum = (n + 1) * n /2;
        }

        System.out.println(sum);
    }
}