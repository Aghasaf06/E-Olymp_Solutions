import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n % 10 == 0) n++;

        while (n % 10 != 0) n++;

        System.out.println(n);
    }
}