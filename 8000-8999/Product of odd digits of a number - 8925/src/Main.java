import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int total = 1;
        while(0 < n){
            if((n % 10) % 2 == 1){
                total *= n % 10;
            }
            n /= 10;
        }

        if(total == 1)
            total = -1;

        System.out.println(total);
    }
}