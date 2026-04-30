import java.util.Scanner;

public class MissingNumber {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long expectedSum = (long) n* (n+1) /2;

        long actualSum = 0;
        for (int i =0 ; i<n-1; i++){
            actualSum += sc.nextLong();
        }
        System.out.println(expectedSum - actualSum);
    }
}
/*
public class MissingNumberXOR {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        long expectedXORSum = 0;
        for (int i=1;i<=n;i++){
            expectedXORSum ^= i;
        }
        long XORinput = 0;
        for (int i =0 ; i < n-1 ; i++){
            XORinput ^= input.nextLong();
        }
        int missing = (int) (expectedXORSum ^ XORinput);
        System.out.println(missing);
    }
}
*/