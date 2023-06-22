import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        for(int i = 1; i <= n * m; i++){
            System.out.print(i + " ");
            if(i % m == 0)
                System.out.print("\n");
        }
    }
}