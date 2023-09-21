import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] letters = word.toCharArray();

        ArrayList<Character> list =new ArrayList<>();

        for(char letter : letters){
            int count = 0;

            for (char c : letters) {
                if (c == letter) {
                    count++;
                }
            }

            if (count > 1) {
                if (!list.contains(letter)) {
                    list.add(letter);
                }
            }
        }

        if(list.isEmpty()){
            System.out.println("NO");
        }
        else{
            for(char ch : list){
                System.out.print(ch);
            }
        }
    }
}