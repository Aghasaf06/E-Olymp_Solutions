import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            arr.add(scan.nextInt());

        int max = 0;
        for(int i = n - 1; 0 <= i; i--){
            int count = 0;

            for (Integer a : arr) {
                if(a == arr.get(i)){
                    count++;
                }
            }

            if (count == max) {
                if (!list.contains(arr.get(i))) {
                    list.add(arr.get(i));
                }
            } else if (count > max) {
                list.removeAll(list);
                max = count;
                list.add(arr.get(i));
            }
        }

        System.out.println(max);

        for(int i = list.size() - 1; 0 <= i; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}