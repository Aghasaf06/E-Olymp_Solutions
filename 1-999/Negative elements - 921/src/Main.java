import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        double[] array = new double[h];

        int count = 0;
        double sum = 0;
        for(int i = 0; i < h; i++) {
            array[i] = scan.nextDouble();
            if(array[i] < 0){
                count++;
                sum += array[i];
            }
        }

        System.out.printf("%d %.2f", count, sum);
    }
}