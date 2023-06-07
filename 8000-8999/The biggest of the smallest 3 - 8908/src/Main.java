import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int l = n.length();
        while(0 < l - 1){
            System.out.print(9);
            l--;
        }
    }
}