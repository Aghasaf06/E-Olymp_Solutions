import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 2; i <= n * 2; i+=2){
            System.out.print(i + " ");
        }
    }
}