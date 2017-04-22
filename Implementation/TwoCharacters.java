import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        int m1 = 0, m2 = 0;
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(!m.containsKey(c))
                m.put(c, 1);
        }
        Set<Character> cSet = m.keySet();
        List<Character> cL = new ArrayList<Character>(cSet);
        int le = 0;
        
        for(int i = 0; i < cL.size(); i++){
            Character ci = cL.get(i);
            String s1;
            for(int j = i+1; j < cL.size(); j++){
                Character cj = cL.get(j);
                s1 = s.replaceAll("[^"+ci+cj+"]", "");
                int k = 1;
                while(k < s1.length()){
                    if((char)s1.charAt(k-1) == (char)s1.charAt(k))
                        break;
                    k+=1;
                }
                if(k == s1.length()){
                    if(s1.length() > le)
                        le = s1.length();
                }
            }            
        }
        System.out.println(le);
    }
}
