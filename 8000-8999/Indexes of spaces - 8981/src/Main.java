import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        int min = 1000, max = 0;

        if(s.contains(" ")){
            char[] CharArray = s.toCharArray();

            for(int i = 0; i < s.length(); i++){
                if(CharArray[i] == ' '){
                    if(i < min)
                        min = i;
                    if(max < i)
                        max = i;
                }
            }
            System.out.print(min + " " + max);
        }
        else
            System.out.print(-1);

    }
}