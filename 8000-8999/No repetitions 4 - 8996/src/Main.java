import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        String[] StringArray = s.split("");

        String result = "";

        for(String l : StringArray){
            boolean bool = result.contains(l);
            if(bool == false)
                result += l;
        }

        System.out.print(result);
    }
}