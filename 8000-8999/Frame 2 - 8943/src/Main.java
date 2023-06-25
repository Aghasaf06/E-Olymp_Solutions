import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            if(i == 0 || n - 1 - i == 0){
                for(int j = 0; j < 3; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 0; j < 3; j++){
                    if(j == 0 || j == 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}