import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            if(i == 0 || n - 1 - i == 0){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
            }
            else{
                if((n - 1) / 2 < i){
                    for(int j = 0; j < n; j++){
                        if(j < n - 1 - i || n - 1 - j < n - 1 - i)
                            System.out.print(" ");
                        else
                            System.out.print("*");
                    }
                }
                else{
                    for(int j = 0; j < n; j++){
                        if(j < i || n - 1 - j < i)
                            System.out.print(" ");
                        else
                            System.out.print("*");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}