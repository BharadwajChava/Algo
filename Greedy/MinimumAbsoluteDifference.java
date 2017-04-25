import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // your code goes here
        Arrays.sort(a);
        long min = Long.MAX_VALUE;
        for(int i = 1; i < a.length; i++){
            long diff = Math.abs(a[i-1] - a[i]);
            if(diff < min)
                min = diff;
        }
        System.out.println(min);
    }
}
