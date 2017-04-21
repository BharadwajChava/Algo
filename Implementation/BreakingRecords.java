import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0, mi = in.nextInt();
        int a = 0, ma = mi;
        while(n-- > 1){
            int x = in.nextInt();
            if(x < mi){
                mi = x;
                i+=1;
            }else if(x > ma){
                ma = x;
                a+=1;
            }
        }
        System.out.println(a + " " + i);
    }
}
