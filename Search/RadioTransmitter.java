import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        Arrays.sort(x);
        int i = 0, c = 0;
        while(i < n){
            long val = x[i]+k;
            c+=1;
            while(i < n && val > x[i])
                i+=1;
            if(i < n && val == x[i]){
                val+=k;
                while(i < n && val >= x[i])
                    i+=1;
            }else if(i < n){
                val = x[i-1]+k;
                while(i < n && val >= x[i])
                    i+=1;
            }
        }
        System.out.print(c);
    }
}
