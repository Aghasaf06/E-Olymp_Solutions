import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 0;
        while(n > 0){
            if(n % 2 == 1)
                i++;
            n /= 2;
        }
        System.out.println(i);
        scan.close();
    }
}