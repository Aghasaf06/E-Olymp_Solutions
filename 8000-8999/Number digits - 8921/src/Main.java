import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        while(0 < n){
            System.out.println(n % 10);
            n /= 10;
        }
    }
}