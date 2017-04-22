import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int i = 0, c = 0;
        while(i < S.length()){
            if((char)S.charAt(i) != 'S')
                c+=1;
            if((char)S.charAt(++i) != 'O')
                c+=1;
            if((char)S.charAt(++i) != 'S')
                c+=1;
            ++i;
        }
        System.out.println(c);
    }
}
