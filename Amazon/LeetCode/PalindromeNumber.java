public class Solution {
    public boolean isPalindrome(int x) {
        String s = new StringBuilder(x+"").reverse().toString();
        return ((s.compareTo(x+"") == 0)?true:false);
    }
}
