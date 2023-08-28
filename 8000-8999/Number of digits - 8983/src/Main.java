import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] symbol = str.toCharArray();

        int count = 0;
        for(char ch : symbol){
            if(Character.isDigit(ch)){
                count++;
            }
        }

        System.out.println(count);
    }
}