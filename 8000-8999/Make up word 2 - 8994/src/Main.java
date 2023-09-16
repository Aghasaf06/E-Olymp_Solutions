import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        char[] letters = b.toCharArray();

        boolean condition = true;

        for(char letter : letters){
            String s = String.valueOf(letter);
            if(!a.contains(s)){
                condition = false;
                System.out.println("No");
                break;
            }
        }

        if(condition){
            System.out.println("Ok");
        }
    }
}