import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 12 || n == 1 || n == 2)
            System.out.println("Winter");
        else if(n == 3 || n == 4 || n == 5)
            System.out.println("Spring");
        else if(n == 6 || n == 7 || n == 8)
            System.out.println("Summer");
        else
            System.out.println("Autumn");
        scan.close();
    }
}