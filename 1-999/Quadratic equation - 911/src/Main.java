import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double D = Math.sqrt(b * b - 4 * a * c);
        double x1, x2;
        if(D > 0) {
            x1 = (-b - D) / (2 * a);
            x2 = (-b + D) / (2 * a);
            if (x1 < x2)
                System.out.println("Two roots: " + (int) x1 + " " + (int) x2);
            else
                System.out.println("Two roots: " + (int) x2 + " " + (int) x1);
        }
        else if(D == 0){
            x1 = -b / (2 * a);
            System.out.println("One root: " + (int)x1);
        }
        else
            System.out.println("No roots");

        scan.close();
    }
}