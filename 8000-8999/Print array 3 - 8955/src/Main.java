import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] array = new int[n];

        int count = 0;

        for(int i = 0; i < n; i++){
            array[i] = scan.nextInt();
            if(array[i] > 0) count++;
        }

        if(count > 0)
            System.out.println(count);
        else
            System.out.print("NO");

        for(int i = 0; i < n; i++){
            if(array[i] > 0)
                System.out.print(array[i] + " ");
        }
    }
}