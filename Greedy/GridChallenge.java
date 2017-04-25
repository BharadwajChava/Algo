import java.io.*;
import java.util.*;

//Problem faced was, rows and columns are lexographically sorted.
 
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0){
            int m = in.nextInt();
            char[] c = in.next().toCharArray();
            Arrays.sort(c);
            int ctl = 1;
            while(m-- > 1){
                char[] c1 = in.next().toCharArray();
                Arrays.sort(c1);
                for(int i = 0; i < c.length; i++)
                    if(c[i] > c1[i]){
                        ctl = 0;
                        break;
                    }
                c = c1;
            }
            if(ctl == 1)
                System.out.println("YES");
            else{
                while(m-- > 1)
                    in.next();
                System.out.println("NO");
            }
        }
    }
}
