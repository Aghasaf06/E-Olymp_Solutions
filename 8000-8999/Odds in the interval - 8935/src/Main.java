import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        for(int i = a; i <= b; i++){
            if(i % 2 == 1)
                System.out.print(i + " ");
        }
    }
}