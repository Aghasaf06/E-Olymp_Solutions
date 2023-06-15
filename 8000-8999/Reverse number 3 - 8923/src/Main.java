import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        while(0 < n){
            System.out.print(n % 10);
            n /= 10;
        }
    }
}