import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int l = n.length();
        System.out.print(1);
        while(0 < l){
            System.out.print(0);
            l--;
        }
    }
}