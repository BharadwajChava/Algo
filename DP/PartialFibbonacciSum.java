import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    public static int totalSum(int sum, long N, List<Integer> aL){
        sum = (sum*((int)N/aL.size()))%10;
        for(int i = 0; i <= N%aL.size(); i++)
            sum = (sum + aL.get(i))%10;
        return sum;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long M = in.nextLong();
        long N = in.nextLong();
        int a = 0;
        int b = 1;
        int sum = 0;
        int j = 1;
        List<Integer> aL = new ArrayList<Integer>();
        aL.add(a); aL.add(b);
        while(j == 1){
            int x = b;
            b = (a+b)%10;
            a = x;
            if (a == 0 && b == 1){
                aL.remove(aL.size()-1);
                break;
            }else{
                aL.add(b);
            }
        }
        if(N < aL.size()){
            for(int i = (int)M; i <= N; i++)
                sum = (sum + aL.get(i))%10;
        }else{
            for(int i = 0; i < aL.size(); i++)
                sum = (sum + aL.get(i))%10;
            int sum1 = sum;
            sum = totalSum(sum, N, aL);
            M -= 1;
            sum -= totalSum(sum1, M, aL);
            if(sum < 0)
                sum+=10;
        }
        System.out.println(sum);
    }
}

