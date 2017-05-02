public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<Character>();
        int i = 0, j = 0, res = 0;
        while(i < len){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                res = Math.max(res, i-j);
            }else{
                set.remove(s.charAt(j++));
            }
        }
        return res;
    }
}
