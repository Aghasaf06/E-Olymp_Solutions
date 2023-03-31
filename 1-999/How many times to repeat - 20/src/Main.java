import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 0;

        while(0 < n){
            int num = n;
            int sum = 0;

            while(0 < num){
                sum += num % 10;
                num /= 10;
            }

            n = n - sum;
            i++;
        }

        System.out.println(i);
    }
}