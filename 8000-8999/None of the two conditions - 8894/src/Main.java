import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n > 0) {
            if(n % 2 == 0){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            if(-n % 2 == 1){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}