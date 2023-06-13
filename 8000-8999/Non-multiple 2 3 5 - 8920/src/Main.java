import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = 1;
        for(int i = 0; i < n; i++){
            boolean bool = false;
            while(bool == false){
                if(result % 2 != 0 && result % 3 != 0 && result % 5 != 0)
                    bool = true;
                else
                    result++;
            }
            System.out.print(result + " ");
            result++;
        }
    }
}