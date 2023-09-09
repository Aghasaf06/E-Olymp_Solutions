import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int l = String.valueOf(s).length();
        char[] ch = s.toCharArray();

        for(int i = 0; i < l - 1; i++){
            if(ch[i] == 'a' && ch[i + 1] == 'b'){
                System.out.print("ups");
                i++;
            }
            else{
                System.out.print(ch[i]);
            }
        }

        System.out.print(ch[l - 1]);
    }
}