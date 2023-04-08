import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i = 0; i < t; i++)
        {
            int k = scan.nextInt();
            int d = 0;
            d = k % 3;
            if(d == 1)
                System.out.println("VGC");
            else if(d == 2)
                System.out.println("CVG");
            else
                System.out.println("GCV");
        }
    }
}