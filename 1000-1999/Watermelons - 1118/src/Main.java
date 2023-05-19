import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 1){
            scan.nextInt();
            System.out.println("Ooops!");
        }
        else if(n == 0)
            System.out.println("Ooops!");
        else{
            int max;
            int min;
            max =  min = scan.nextInt();

            for(int i = 1; i < n; i++){
                int weight = scan.nextInt();
                if(max < weight)
                    max = weight;
                if(min > weight)
                    min = weight;
            }
            System.out.println(min + " " + max);
        }

        scan.close();
    }
}