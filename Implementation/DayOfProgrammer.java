import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        int x = 0;
        if(year <= 1917){
            if(year%4 == 0)
                x = 1;
        }
        else if(year >= 1919){
            if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
                x = 1;
        }
        else{
            x = -13;
        }
        x = 256 - 243 - x;
        return x+".09."+year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
