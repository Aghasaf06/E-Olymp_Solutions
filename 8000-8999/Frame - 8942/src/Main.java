import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 0; i < 3; i++){
            if(i == 1){
                for(int j = 0; j < n; j++){
                    if(j == 0 || n - 1 - j == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            else{
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}