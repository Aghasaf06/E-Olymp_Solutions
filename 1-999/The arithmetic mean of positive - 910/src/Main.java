import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double sum = 0;
        int k = 0;
        for(int i = 0; i < n; i++){
            double a = scan.nextDouble();
            if(a > 0){
                sum += a;
                k++;
            }
        }

        if(k > 0)
            System.out.printf("%.2f", sum / k);
        else
            System.out.println("Not Found");

        scan.close();
    }
}