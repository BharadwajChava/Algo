import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        while(m-- > 0){
            int c = in.nextInt();
            int n = in.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
                map.put(a[i], i+1);
            }
            for(int i = 0; i < n; i++){
                if(a[i] < c){
                    Integer v = c-a[i];
                    if(map.containsKey(v)){
                        int p = map.get(v);
                        int q = map.get(a[i]);
                        int r = i+1;
                        if(p == r)
                            System.out.println(p + " " + q);
                        else
                            System.out.println(r + " "+ p);
                        break;
                    }
                }
            }
        }
    }
}
