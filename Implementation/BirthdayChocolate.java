import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        int s = 0, c = 0, i = 0;
        for(i = 0; i < m; i++){
            s+=squares[i];
        }
        if(s == d)
            c += 1;
        for(int j = i; j < squares.length; j++){
            s+=squares[j]-squares[j-m];
            if(s == d)
                c+=1;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
