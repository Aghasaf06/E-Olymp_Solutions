import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] symbol = str.toCharArray();

        int count = 0;
        for(int i = 0; i < symbol.length; i++){
            if(symbol[i] == '+' || symbol[i] == '-' || symbol[i] == '%'){
                count++;
            }
            else if(symbol[i] == '*' || symbol[i] == '/'){
                count++;
                i++;
            }
        }

        System.out.println(count);
    }
}