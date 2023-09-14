import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] symbol = str.toCharArray();

        System.out.print(symbol[0]);
        for(int i = 1; i < symbol.length; i++){
            if(symbol[i] != symbol[i - 1]){
                System.out.print(symbol[i]);
            }
        }
    }
}