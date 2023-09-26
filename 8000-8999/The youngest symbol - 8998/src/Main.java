import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        char[] charArray = s.toCharArray();

        char youngest = 122;
        int count = 0;
        for(char l : charArray){
            if((int)l < (int)youngest){
                youngest = l;
                count = 1;
            }
            else if((int)l == (int)youngest){
                count++;
            }
        }

        System.out.print(youngest + " " + count);
    }
}