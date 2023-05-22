import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];
        for(int j = 0; j < 3; j++) array[j] = scan.nextInt();

        int a = 0;
        int b = 0;

        for(int i = 0; i < 3; i++) {
            if (array[i] % 2 == 0) a++;
            else b++;

            if(a > 0 && b > 0) {
                System.out.println("YES");
                break;
            }
        }

        if(a == 0 || b == 0) System.out.println("NO");

        scan.close();
    }
}