import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for(int i = 0; i < t; i++){
            int V = scan.nextInt();
            int E = scan.nextInt();

            int x = 2 - V + E;
            System.out.println(x);
        }
    }
}