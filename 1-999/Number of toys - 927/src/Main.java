import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] number = new int[n];
        double[] price = new double[n];

        int sum = 0;
        for(int i = 0; i < n; i++) {
            number[i] = scan.nextInt();
            price[i] = scan.nextDouble();

            if(price[i] < 50)
                sum += number[i];
        }

        System.out.println(sum);
    }
}