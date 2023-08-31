import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        char[] CharArray = s.toCharArray();

        for(char l : CharArray){
            if(l != 'a')
                System.out.print(l);
        }
    }
}