import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        char[] charArray = s.toCharArray();

        for(char l : charArray){
            if(l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'y')
                System.out.print(l + "" + l);
            else
                System.out.print(l);
        }
    }
}