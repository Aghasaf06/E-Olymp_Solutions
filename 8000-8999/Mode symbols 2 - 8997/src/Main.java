import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] letters = word.toCharArray();

        ArrayList<Character> list =new ArrayList<>();

        int max = 0;
        for(char letter : letters){
            int count = 0;

            for (char c : letters) {
                if (c == letter) {
                    count++;
                }
            }

            if (count == max) {
                if (!list.contains(letter)) {
                    list.add(letter);
                }
            } else if (count > max) {
                list.removeAll(list);
                max = count;
                list.add(letter);
            }
        }

        System.out.println(max);

        for(char ch : list){
            System.out.print(ch + " ");
        }
    }
}