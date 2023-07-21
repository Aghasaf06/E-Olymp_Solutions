import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int min = Integer.MAX_VALUE;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list1.add(scan.nextInt());

            if (list1.get(i) < min) {
                min = list1.get(i);
                list2.clear();
                list2.add(min);
            } else if (list1.get(i) == min) {
                list2.add(min);
            }
        }

        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }

        for (Integer integer : list1) {
            if (!list2.contains(integer)) {
                System.out.print(integer + " ");
            }
        }

    }
}