public class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int[][] dp = new int[len][len];
        long max = 0;
        for(int i = len-1; i >= 0; i--){
            for(int j = i; j < len; j++){
                dp[i][j] = (i==j)?height[i]:Math.min(height[i], dp[i+1][j]);
                long val = (j-i+1)*dp[i][j];
                if(max < val)
                    max = val;
            }
        }
        return (int)max;
    }
}
