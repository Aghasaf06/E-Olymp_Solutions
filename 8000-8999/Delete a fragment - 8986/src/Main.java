import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int n = scan.nextInt();
        int m = scan.nextInt();

        char[] CharArray = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            if(i < n || m < i)
                System.out.print(CharArray[i]);;
        }
    }
}