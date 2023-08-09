import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        char[] CharArray = s.toCharArray();

        System.out.println(CharArray[2] + "" + CharArray[6] + "" + CharArray[10]);

        System.out.println(CharArray[0] + "" + CharArray[s.length() - 2] + "" + CharArray[s.length() - 1]);

        for(int i = 0; i < 7; i++)
            System.out.print(CharArray[i]);
        System.out.print("\n");

        for(int i = 4; i < s.length(); i++)
            System.out.print(CharArray[i]);
        System.out.print("\n");

        for(int i = 1; i < s.length(); i+=2)
            System.out.print(CharArray[i]);
        System.out.print("\n");

        System.out.println((s.length()) / 2);

        for(int i = s.length() - 1; 0 <= i; i--)
            System.out.print(CharArray[i]);
    }
}