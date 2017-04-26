import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        while(M%N != 0){
            int x = N;
            N = M%N;
            M = x;
        }
        System.out.println(N);
    }
}
