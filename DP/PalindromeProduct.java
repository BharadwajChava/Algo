import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int largestPalindrome(int n) {
        if(n == 1)
            return 9;
        int max = (int)(Math.pow(10, n)) - 1;
        int min = max/10 + 1;
        long pStart = ((long)max * (long)max)/(long)(Math.pow(10, n));
        
        boolean isPal = false;
        while(pStart >= 0){
            long num = getNum(pStart);
            for(int i = max; i >= min; i--){
                if(num%i == 0 && num/i >= min && num/i <= max){
                    int n1 = (int)(num%1337);
                    return n1;
                }
            }
            pStart-=1;
        }
        
        
        return 0;
    }
    
    public static long getNum(long pStart){
        String s1 = pStart + "";
        String s = s1 + new StringBuilder(s1).reverse().toString();
        long l = Long.parseLong(s);
        return l;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(largestPalindrome(in.nextInt()));
    }
}
