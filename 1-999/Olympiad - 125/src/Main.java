import java.util.*;

public class Main {
    public static int s_sum(int h, int m, int s){
        int t = h * 3600 + m * 60 + s;
        return t;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h1 = scan.nextInt();
        int m1 = scan.nextInt();
        int s1 = scan.nextInt();

        int h2 = scan.nextInt();
        int m2 = scan.nextInt();
        int s2 = scan.nextInt();

        int t = s_sum(h2, m2, s2) - s_sum(h1, m1, s1);

        System.out.print(t / 3600 + " " + t % 3600 / 60 + " " + t % 60);
        scan.close();
    }
}