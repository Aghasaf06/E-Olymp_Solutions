import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int count = 0;
        while(i != 0){
            i = scan.nextInt();
            count++;
        }
        System.out.println(--count);
    }
}