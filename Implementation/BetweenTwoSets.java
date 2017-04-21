import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int ma = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a[a_i] > ma)
                ma = a[a_i];
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(b[b_i] < mi)
                mi = b[b_i];
        }
        int result = 0;
        while(ma <= mi){
            int i=0, ctl = 1;
            while(i < n && ctl == 1){
                if(ma%a[i] != 0)
                    ctl = 0;
                i+=1;
            } i = 0;
            while(i < m && ctl == 1){
                if(b[i]%ma != 0)
                    ctl = 0;
                i+=1;
            }
            if(ctl == 1)
                result+=1;
            ma+=1;
        }
        System.out.println(result);
    }
}
