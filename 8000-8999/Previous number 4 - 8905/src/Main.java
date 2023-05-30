import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n--;
        boolean bool = false;
        while(bool == false) {
            if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0)
                bool = true;
            n--;
        }
        System.out.print(++n);
    }
}