import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Varargs allows passing any number of int arguments.
// Internally, 'numbers' behaves like an int[] array.
// Example calls: add(1,2), add(1,2,3), add(1,2,3,4,5)
class Add
{
    void add(int... numbers)
    {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            stringBuilder.append(numbers[i]);
            if(i != numbers.length - 1){
                stringBuilder.append("+");
            }
        }
        stringBuilder.append("=");
        stringBuilder.append(sum);
        System.out.println(stringBuilder.toString());
    }
}
/*
 * Java Varargs (Variable Arguments)

 * Rules:
 * 1. Allows a method to accept any number of arguments.
 * 2. Syntax: datatype... parameterName
 *    Example: int... numbers
 * 3. Inside the method, varargs behaves like an array.
 * 4. Only one varargs parameter is allowed per method.
 * 5. Varargs parameter must be the last parameter.

 * Example:
 * add(1, 2);
 * add(1, 2, 3);
 * add(1, 2, 3, 4, 5);

 * All calls are handled by:
 * void add(int... numbers)
 */
public class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
