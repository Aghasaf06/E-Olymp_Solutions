import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        char[] letters = b.toCharArray();

        for(int i = 0; i < a.length(); i++){
            list.add(a.charAt(i));
        }

        boolean condition = true;

        for(char letter : letters){
            Object s = letter;
            if(!list.contains(s)){
                condition = false;
                System.out.println("No");
                break;
            }
            else{
                list.remove(s);
            }
        }

        if(condition){
            System.out.println("Ok");
        }
    }
}