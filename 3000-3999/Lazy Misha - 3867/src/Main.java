import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] t = new int[3];
        int min = t[0] = scan.nextInt();

        for(int i = 1; i < 3; i++){
            t[i] = scan.nextInt();
            if(t[i] < min)
                min = t[i];
        }
        System.out.println(min);
        scan.close();
    }
}