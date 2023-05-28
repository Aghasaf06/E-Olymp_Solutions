import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(n = n + 1; true; n++)
            if(n % 7 == 0)
                break;

        System.out.println(n);
    }
}