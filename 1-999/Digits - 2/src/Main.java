import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        if(n == 0)
            System.out.println(1);
        else{
            while(1 <= n){
                n /= 10;
                i++;
            }
            System.out.println(i);
        }
        scan.close();
    }
}