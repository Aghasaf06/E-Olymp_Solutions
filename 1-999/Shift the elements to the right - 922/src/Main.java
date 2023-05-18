import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int[] slideArray = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            if(i < n - 1)
                slideArray[i + 1] = array[i];
            else
                slideArray[0] = array[i];
        }

        for(int a : slideArray)
            System.out.print(a + " ");
    }
}