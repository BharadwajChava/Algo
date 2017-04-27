import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long m1 = -1, m2=-1;
        while(N-- > 0){
            long x = in.nextInt();
            if(m1 < x){
                m2 = m1;
                m1 = x;
            }else if(m2 < x)
                m2 = x;
        }
        System.out.println(m1*m2);
    }
}

