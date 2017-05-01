import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long makeChange(int[] coins, int money) {
        int len = coins.length;
        long[][] dp = new long[len+1][money+1];
        for(int i = 0; i < len+1; i++)
            dp[i][0] = 1;
        for(int i = 1; i < money+1; i++)
            dp[0][i] = 0;
        for(int i = 1; i <= len; i++){
            for(int j = 1; j <= money; j++){
                if(j >= coins[i-1]){
                    dp[i][j] = dp[i-1][j]+dp[i][j-coins[i-1]];
                }else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[len][money];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }
}
