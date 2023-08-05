import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = arr.length - 1; 0 <= i; i--){
            int count = 0;

            for (Integer a : arr) {
                if(a == arr[i]){
                    count++;
                }
            }

            if (count > 1 && !list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            System.out.print("NO");
        }
        else {
            for (int i = list.size() - 1; 0 <= i; i--) {
                System.out.print(list.get(i) + " ");
            }
        }

    }
}