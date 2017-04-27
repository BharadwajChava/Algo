public class Solution {
    public int strStr(String h, String n) {
        int len1 = h.length();
        int len2 = n.length();
        if(len1 < len2)
            return -1;
        else if(n.compareTo("") == 0)
            return 0;
        int i = 0, j = 0;
        while(i < len1){
            if( (char)h.charAt(i) == (char)n.charAt(0) ){
                if(i+len2-1 < len1){
                    String s = h.substring(i, i+len2);
                    if(s.compareTo(n) == 0)
                        return i;
                }else
                    return -1;
            }
            i+=1;
        }
        return -1;
    }
}
