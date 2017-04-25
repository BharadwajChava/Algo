import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        while(N-- > 0){
            a[N] = in.nextInt();
        }
        Arrays.sort(a);
        int t1 = -1, t2 = -1, t3 = -1; 
        for(int i = 2; i < a.length; i++){
            if((a[i-2]+a[i-1]) > a[i]){
                if((t3 < a[i])||(t3 == a[i] && t1 < a[i-2])||(t3 == a[i] && t1 == a[i-2] && t2 < a[i-1])){
                    t3 = a[i]; t2 = a[i-1]; t1 = a[i-2];
                }
            }
        }
        if(t1 == -1)
            System.out.println(-1);
        else
            System.out.println(t1 + " " + t2 + " " + t3);
    }
}
