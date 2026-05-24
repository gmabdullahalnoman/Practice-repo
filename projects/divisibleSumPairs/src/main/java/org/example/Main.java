package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    // Method divisibleSumPairs(n, k, arr)
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;
            for (int i = 0;i < n - 1;i++){
                for (int j = i + 1; j < n;j++){
                    int sum = ar.get(i) + ar.get(j);
                if (sum % k == 0) {
                    count = count + 1;
            }//end if
        }//end inner loop
    }//end outer loop

        return count; //return int count
    } // end function
}
public class Main {
    static void main()throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arTemp = bufferedReader.readLine().split(" ");
        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.divisibleSumPairs(n, k, ar);

        System.out.println(result);
        bufferedReader.close();

        bufferedReader.close();
    }
}
