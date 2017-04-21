import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = Math.abs(in.nextInt());
        int t = Math.abs(in.nextInt());
        int a = Math.abs(in.nextInt());
        int b = Math.abs(in.nextInt());
        int m = Math.abs(in.nextInt());
        int n = Math.abs(in.nextInt());
        int c = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            int apple = in.nextInt() + a;
            if(apple >= s && apple <= t)
                c+=1;
        }
        System.out.println(c);
        c = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
            int orange = in.nextInt() + b;
            //System.out.println(orange);
            if(orange >= s && orange <= t){
                c+=1;
            }
        }
        System.out.println(c);
    }
}
