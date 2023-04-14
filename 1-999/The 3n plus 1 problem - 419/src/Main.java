import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            int i = scan.nextInt();
            int j = scan.nextInt();
            int max = 0;

            for(int k = min(i, j); k <= max(i, j); k++){
                int m = k;
                int n = 1;
                while(m != 1){
                    if(m % 2 == 1)
                        m = 3 * m + 1;
                    else
                        m /= 2;
                    n++;
                }
                if(n > max)
                    max = n;
            }
            System.out.println(i + " " + j + " " + max);
        }

        scan.close();
    }
}