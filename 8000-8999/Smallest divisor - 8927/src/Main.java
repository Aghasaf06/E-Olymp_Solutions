import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean condition = true;

        if(n == 2 || n == 3){
            System.out.println(n);
            condition = false;
        }
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    System.out.println(i);
                    condition = false;
                    break;
                }
            }
        }

        if(condition){
            System.out.println(n);
        }
    }
}