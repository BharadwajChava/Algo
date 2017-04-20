import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long max(long p, long q){
        if(p < q)
            return q;
        return p;
    } 
    public static long min(long p, long q){
        if(p < q)
            return p;
        return q;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long sum = a+b+c+d+e;
        long mi = min(a,b);
        mi = min(mi,c);
        mi = min(mi,d);
        mi = min(mi,e);
        long ma = max(a,b);
        ma = max(ma,c);
        ma = max(ma,d);
        ma = max(ma,e);
        System.out.print(sum-ma + " ");
        System.out.print(sum-mi);
    }
}
