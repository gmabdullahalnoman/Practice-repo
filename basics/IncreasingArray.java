import java.util.Scanner;
public class IncreasingArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter array size : ");
        int n = sc.nextInt();
        long[] array = new long[n];
        
        /*
        int i=0;
        while (i<n){
        array [i] = sc.nextLong();
        i++;
        */
        for(int i=0;i<n;i++){
            array[i] = sc.nextLong();
        }
        long totalMoves =0;
        
        for (int i =1;i<n;i++){
            if (array[i] < array[i-1]){
                totalMoves += (array[i-1]- array[i]);
                array[i] = array[i-1];
            }
        }
        System.out.println(totalMoves);
    }
}
