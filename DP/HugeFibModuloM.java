import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        int M = in.nextInt();
        int a = 0;
        int b = 1;
        int brk = 1;
        List<Integer> aL = new ArrayList<Integer>();
        aL.add(a);
        aL.add(b);
        while(brk == 1 && M != 1){
            int x = b;
            b = (a+b)%M;
            a = x;
            if(a == 0 && b == 1){
                aL.remove(aL.size()-1);
                break;
            }
            else
                aL.add(b);
        }
        int x = (int)(N%((long)aL.size()));
        System.out.println(aL.get(x));
    }
}
