import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        double d = (double)(x1-x2)/(v2-v1) ;
        if(d < 0 || d != (int)d)
            System.out.println("NO");
        else if(d == (int)d)
                System.out.println("YES");
        
    }
}
