import java.util.Scanner;
public class TwoKnights {
    public static void main(String agrs[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (long k = 1; k <= n; k++) {
            
            long totalWays = (k * k) * (k * k - 1) / 2;
            
            long attackingWays = 0;

            if (k > 2) {
                attackingWays = 4 * (k - 1) * (k - 2);
            }
            System.out.println(totalWays - attackingWays);
        }
    }
}