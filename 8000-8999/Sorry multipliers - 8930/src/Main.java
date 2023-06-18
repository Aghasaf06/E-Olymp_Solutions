import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n ==17){
            System.out.println(n);
        }
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                while(n % i == 0){
                    System.out.println(i);
                    n /= i;
                }
            }
        }

        if(n > 1){
            System.out.println(n);
        }
    }
}