import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long M = in.nextLong();
        long N = in.nextLong();
        int a = 0;
        int b = 1;
        int sum = 0;
        int i = 2;
        if(M == 0 && N == 0)
            sum = 0;
        else if(M == 0 && N == 1)
            sum = 1;
        else if(M == 0)
            sum = 1;
            
        while(i <= N){
            int x = b;
            b = (a+b)%10;
            a = x;
            if (i >= M)
                sum = (sum + b)%10;
            i+=1;
        }
        System.out.println(sum);
    }
}

