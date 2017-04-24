import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        long total = (long)row*col;
        int k = in.nextInt();
        Map<Integer, TreeMap<Integer, Integer>> m = new HashMap<Integer, TreeMap<Integer, Integer>>();
        Set<Integer> set = new HashSet<Integer>();
        while(k-- > 0){
            int r = in.nextInt();
            int c1 = in.nextInt();
            int c2 = in.nextInt();
            set.add(r);
            if(m.containsKey(r)){
                TreeMap<Integer, Integer> tm = m.get(r);
                if(tm.containsKey(c1)){
                    int c = tm.get(c1);
                    tm.put(c1, c2>c ? c2 :c);
                }else
                    tm.put(c1, c2);
            }else
                m.put(r, new TreeMap<Integer, Integer>(){{put(c1, c2);}});            
        }
        Iterator itr = set.iterator();
        long sum = 0;
        while(itr.hasNext()){
            TreeMap<Integer, Integer> tm = m.get(itr.next());
            int start = 1, a = 0, b = -1, c;
            for(Integer x: tm.keySet()){
                if(start != 1){
                    c = tm.get(x);
                    if(b >= x){
                        b = b>c ? b : c;
                    }else
                        start = 1;
                }
                if(start == 1){
                    sum = (long)(sum + b - a + 1);
                    a = x;
                    b = tm.get(x);
                    start = 0;
                }
            }
            sum = (long)((sum + b - a + 1));
        }
        System.out.print((long)(total-sum));
    }
}
