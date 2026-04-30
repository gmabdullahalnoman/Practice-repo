 import java.util.*;
public class TwoSets{
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long totalSum = (long) n * (n + 1) / 2;

        if (totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            List<Integer> set1 = new ArrayList<>();
            List<Integer> set2 = new ArrayList<>();

            long target = totalSum / 2;
            for (int i = n; i >= 1; i--) {
                if (i <= target) {
                    set1.add(i);
                    target -= i;
                } else {
                    set2.add(i);
                }
            }

            System.out.println("YES");
            System.out.println(set1.size());
            for (int num : set1) System.out.print(num + " ");
            System.out.println();
            System.out.println(set2.size());
            for (int num : set2) System.out.print(num + " ");
        }
    }
}