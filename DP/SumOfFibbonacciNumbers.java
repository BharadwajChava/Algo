import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Only the last digit

public class Solution {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        int a = 0;
        int b = 1;
        int sum = 1;
        N-=1;
        while(N-- > 0){
            int x = b;
            b = (a+b)%10;
            a = x;
            sum = (sum + b)%10;
        }
        System.out.println(sum);
    }
}

