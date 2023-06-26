import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
            }
            else if(i % 4 == 3){
                for(int j = 0; j < n; j++){
                    if(j == 0)
                        System.out.print("*");
                }
            }
            else if(i % 4 == 1){
                for(int j = 0; j < n; j++){
                    if(j == n - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}