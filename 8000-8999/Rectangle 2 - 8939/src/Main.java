import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= n * 4; i++){
            System.out.print("#");
            if(i % n == 0)
                System.out.print("\n");
        }
    }
}