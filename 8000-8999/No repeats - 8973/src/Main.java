import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = arr.length - 1; 0 <= i; i--) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        for (int i = list.size() - 1; 0 <= i; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}