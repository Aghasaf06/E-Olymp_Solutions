import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        char[] CharArray = s.toCharArray();

        System.out.println(CharArray[1] + "" + CharArray[3] + "" + CharArray[9]);

        System.out.println(CharArray[0] + "" + CharArray[1] + "" + CharArray[s.length() - 1]);

        for(int i = s.length() - 5; i < s.length(); i++)
            System.out.print(CharArray[i]);
        System.out.print("\n");

        for(int i = 0; i < s.length() - 4; i++)
            System.out.print(CharArray[i]);
        System.out.print("\n");

        for(int i = 0; i < s.length(); i+=2)
            System.out.print(CharArray[i]);
        System.out.print("\n");

        System.out.println((s.length() + 1) / 2);

        for(int i = s.length() - 1; 0 <= i; i-=2)
            System.out.print(CharArray[i]);
    }
}