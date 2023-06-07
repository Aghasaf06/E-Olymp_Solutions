import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        double max = 0;
        while(max < n){
            max = Math.pow(i, 3);
            i++;
        }
        System.out.print((int)Math.pow(i - 2, 3));
    }
}