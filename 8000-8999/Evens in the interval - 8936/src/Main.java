import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        for(int i = b; a <= i; i--){
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}