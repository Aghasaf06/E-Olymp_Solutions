import java.util.*;

public class Main {

    static int rooms(int a, int b){

        int n;

        if(a % b == 0) n = a / b;
        else n = a / b + 1;

        return n;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(rooms(n, k) + rooms(m, k));

        scan.close();
    }
}