import java.util.Scanner;
public class Repetition {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String dna = input.nextLine();

        if(dna.length() == 0 ){
            System.out.println(0);
            return;
        }
        int maxCount = 1;
        int currentCount = 1;
        
        for (int i=1; i< dna.length(); i++){
            if(dna.charAt(i)==dna.charAt(i-1)){
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            }else{
                currentCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}