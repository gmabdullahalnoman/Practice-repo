import java.util.Scanner;
public class WierdAlgorithm {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //for ( ;n != 0; ) { 
        while (n != 1) {
            System.out.print(n + " ");
        if (n % 2 == 0){
            n = n/2;
        }else{
            n = n*3+1;
        }
        }
        System.out.print(1);   
    }
}