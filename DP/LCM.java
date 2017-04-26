import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    public static int GCD(int M, int N){
    while(M%N != 0){
            int x = N;
            N = M%N;
            M = x;
        }
    return N;
}
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        
        System.out.println((long)N*M/GCD(M, N));
    }
}
