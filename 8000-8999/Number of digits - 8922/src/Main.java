import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 0){
            System.out.println(1);
        }
        else{
            if(n < 0) n = -n;
            int count = 0;
            while(0 < n){
                count++;
                n /= 10;
            }
            System.out.println(count);
        }
    }
}