import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] array = new double[n];

        int count = 0;
        double sum = 0;
        for(int i = 0; i < n; i++) {
            array[i] = scan.nextDouble();
            if((i + 1) % 3 == 0 && array[i] > 0){
                count++;
                sum += array[i];
            }
        }

        System.out.printf("%d %.2f", count, sum);
    }
}