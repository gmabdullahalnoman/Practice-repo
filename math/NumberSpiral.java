import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class NumberSpiral {
    public static void main(String agrs[]) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String[] parts = reader.readLine().split(" ");
            long y = Long.parseLong(parts[0]);
            long x = Long.parseLong(parts[1]);

            long n = Math.max(y, x);
            long value;
      
      if (n % 2 == 0) {  // Even layer
                if (y == n) {
                    value = n * n - x + 1;
                } else {
                    value = (n - 1) * (n - 1) + y;
                }
            } else {  // Odd layer
                if (x == n) {
                    value = n * n - y + 1;
                } else {
                    value = (n - 1) * (n - 1) + x;
                }
            }

            System.out.println(value);
        }
    }
}