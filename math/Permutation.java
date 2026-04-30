import java.util.Scanner;
public class Permutation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
    if (n==2 || n==3){
        System.out.println("NO SOLUTION");
        return;
    }
    StringBuilder sb = new StringBuilder();
    
        for (int i = 2; i <= n; i+=2){
            sb.append(i).append(" ");
        }
        for (int i =1 ; i<= n; i+=2){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }    
}