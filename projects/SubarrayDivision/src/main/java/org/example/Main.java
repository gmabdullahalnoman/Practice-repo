package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */
    // Method birthday(s, d, m)
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

       int count = 0;
        for (int i = 0; i<= s.size() - m; i++){
        int sum = 0;
        for (int j = i; j < i + m ; j++){
        sum = sum + s.get(j);
        } //end for
        if (sum == d){
                count = count + 1;
        } //end if
        } //end for
    return count; // RETURN count
    } //END FUNCTION

}
public class Main {
    static void main()throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        String[] firstMultipleInput = bufferedReader.readLine().split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);

        System.out.println(result);

        bufferedReader.close();
    }
}
