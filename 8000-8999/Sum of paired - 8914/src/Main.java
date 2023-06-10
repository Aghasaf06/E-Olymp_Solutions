import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, sum = 0;
        while (0 != (n = scan.nextInt())) {
            if (n % 2 == 0)
                sum += n;
        }
        System.out.print(sum);
    }
}