import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        for(int i = 0; i < n; i++){
            if(i == 0 || n - 1 - i == 0){
                for(int j = 0; j < m; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 0; j < m; j++){
                    if(j == 0 || m - 1 - j == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}