import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int m = in.nextInt();
        int i = 0;
        while(i < n){
            int a = (int)s.charAt(i);
            m = m%26;
            if(a >= 65 && a <= 90){
                a+=m;
                if(a > 90)
                    a = a - 26;
            }else if(a >= 97 && a <= 122){
                a+=m;
                if(a > 122)
                    a = a - 26;
            }
            System.out.print((char)a);
            i+=1;
        }
    }
}
