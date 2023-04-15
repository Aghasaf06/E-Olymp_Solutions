import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float l = scan.nextFloat();
        int k = scan.nextInt();

        int i = 0;
        if(l <= 1)
            System.out.println(i);
        else{
            while(l > 1){
                l /= k;
                i++;
            }
            System.out.println(i - 1);
        }
        scan.close();
    }
}