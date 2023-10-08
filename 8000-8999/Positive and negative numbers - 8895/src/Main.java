import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        for (int i = 0; i < 3; i++) a[i] = scanner.nextInt();

        boolean positive, negative;
        positive = false;
        negative = false;

        for(int i: a) {
            if(i > 0) positive = true;
            if(i < 0) negative = true;
        }

        if(positive && negative) System.out.println("YES");
        else System.out.println("NO");
    }
}