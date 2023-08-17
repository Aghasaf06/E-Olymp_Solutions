import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        if(s.contains("a")){
            char[] CharArray = s.toCharArray();

            for(char l : CharArray){
                if(l == 'a'){
                    System.out.print("a");
                }
            }
        }
        else
            System.out.print(-1);
    }
}