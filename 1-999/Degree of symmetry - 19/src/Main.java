import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String s = String.valueOf(n);

        int[] array = new int[s.length()];

        int k = 0;
        while(n != 0){
            array[k] = n % 10;
            n /= 10;
            k++;
        }

        int count = 0;
        for(int i = 0; i < (s.length() + 1) / 2; i++){
            if(array[i] == array[s.length() - 1 - i])
                count++;
        }

        System.out.println(count);
    }
}