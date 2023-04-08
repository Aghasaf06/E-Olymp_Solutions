import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 0;
        while(n != 1){
            if(n % 2 == 0)
                n /= 2;
            else
                n += 1;
            i++;
        }

        System.out.println(i);
        scan.close();
    }
}