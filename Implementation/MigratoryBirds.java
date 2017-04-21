import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int types_i=0; types_i < n; types_i++){
            int t = in.nextInt();
            if(m.containsKey(t))
                m.put(t, m.get(t)+1);
            else
                m.put(t, 1);
        }
        int ma = 0;
        int v = 0;
        for(Integer i: m.keySet()){
            if(ma < (int)m.get(i)){
                ma = m.get(i);
                v = i;
            }
        }
        System.out.println(v);
    }
}
