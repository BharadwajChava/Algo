import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int grades_i=0; grades_i < n; grades_i++){
            int g = in.nextInt();
            int r = g%5;
            if(r >= 3 && g >= 37)
                g += 5- r;
            System.out.println(g);
        }
    }
}
