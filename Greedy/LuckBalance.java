import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        List<Integer> aL = new ArrayList<Integer>();
        int luck = 0;
        while(N-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            if(b == 1)
                aL.add(a);
            else
                luck += a;
        }
        Collections.sort(aL, new Comparator<Integer>(){
           public int compare(Integer a, Integer b){
               return b.compareTo(a);
           } 
        });
        for(int i = 0; i < aL.size(); i++){
            if(i < K){
                luck += aL.get(i);
            }else{
                luck -= aL.get(i);
            }
        }
        System.out.println(luck);
    }
}
