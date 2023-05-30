import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 2;
        while(result < n) {
            result *= 2;
        }
        System.out.print(result / 2);
    }
}