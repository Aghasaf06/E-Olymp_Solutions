import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        if(s.contains("a")){
            char[] CharArray = s.toCharArray();

            for(int i = 0; i < s.length(); i++){
                if(CharArray[i] == 'a')
                    System.out.print(i + " ");
            }
        }
        else
            System.out.print(-1);

    }
}