import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        char[] charArray = s.toCharArray();

        char largest = 'A';
        int count = 0;
        for(char l : charArray){
            if((int)l > (int)largest){
                largest = l;
                count = 1;
            }
            else if((int)l == (int)largest){
                count++;
            }
        }

        System.out.print(largest + " " + count);
    }
}