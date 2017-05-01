import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int len1 = first.length();
        int len2 = second.length();
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i = 0; i<len1; i++){
            int c = first.charAt(i)-97;
            a[c] += 1;
        }
        for(int i = 0; i<len2; i++){
            int c = second.charAt(i)-97;
            b[c] += 1;
        }
        int count = 0;
        for(int k = 0; k < 26; k++){
            count += Math.abs(a[k] - b[k]);
        }
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
