import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int w = scan.nextInt();
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b2 = scan.nextInt();
        int a3 = scan.nextInt();
        int b3 = scan.nextInt();

        if(w >= a1 && k <= b1 || w >= a2 && k <= b2 || w >= a3 && k <= b3 || w >= a1 + a2 && k <= b1 + b2 || w >= a1 + a3 && k <= b1 + b3 || w >= a2 + a3 && k <= b2 + b3 || w >= a1 + a2 + a3 && k <= b1 + b2 + b3)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}