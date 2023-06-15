import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int total = 0;
        int divisor;
        int count = 0;
        while (0 < n){
            divisor = n % 10;
            if(divisor % 2 == 0){
                total += divisor;
                count++;
            }
            n /= 10;
        }

        if(count == 0) System.out.println(-1);
        else System.out.println(total);
    }
}