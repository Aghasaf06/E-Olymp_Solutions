import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double sum = 0;
        double total = 1;
        while(n > 0){
            sum += n % 10;
            total *= n % 10;
            n /= 10;
        }

        double result = total / sum;
        System.out.printf("%.3f", result);
    }
}