import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            int l = scan.nextInt();
            int w = scan.nextInt();
            int h = scan.nextInt();

            int s = 2 * (l * h + w * h);

            if(s % 16 == 0)
                System.out.println(s / 16);
            else
                System.out.println(s / 16 + 1);
        }
        scan.close();
    }
}