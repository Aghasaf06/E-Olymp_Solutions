import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(a <= x && b <= y || a <= y && b <= x || a <= x && c <= y || a <= y && c <= x || b <= x && c <= y || b <= y && c <= x)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}