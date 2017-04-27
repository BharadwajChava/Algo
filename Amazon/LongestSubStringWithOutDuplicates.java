import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        
        int l = 0;
        int l1 = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++ ){
            Character c = s.charAt(i);
            if(!m.containsKey(c)){
                m.put(c, i);
                l1+=1;
            }else{
                l = l < l1 ? l1 : l;
                l1 = l1 - m.get(c) + start;
                int j = start;
                start = m.get(c)+1;
                for(; j < start; j++)
                    m.remove(s.charAt(j));
                m.put(c, i);
            }
        }
        return l>l1?l:l1;
    }
}
