import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int d1 = 0;
            int d2 = 32;
            int n = scan.nextInt();

            for(int j = 0; j < n; j++ ){
                int a = scan.nextInt();
                int b = scan.nextInt();
                d1 = Math.max(d1,a);
                d2 = Math.min(d2,b);

            }
            System.out.println(d1 > d2 ? "NO" : "YES");
        }
    }
}