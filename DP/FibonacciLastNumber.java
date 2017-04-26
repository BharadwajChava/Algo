import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 0;
        int b = 1;
        if(N == 0)
            b = 0;
        N-=1;
        while(N-- > 0){
            int x = b;
            b = (a + b)%10;
            a = x;
        }
        
        System.out.println(b);
    }
}
