public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] p = new boolean[len][len];
        String res = "";
        for(int i = len-1; i >= 0; i--){
            for(int j = i; j < len; j++){
                p[i][j] = (s.charAt(i) == s.charAt(j))&&(j-i <= 2 || p[i+1][j-1]) ;
                if(p[i][j] && (j-i+1)>=res.length() ){
                    res = s.substring(i, j+1);
                }
            }
        }
        
        return res;
    }
}
