import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        Arrays.sort(unsorted, new Comparator<String>(){
            public int compare(String a, String b){
                if(a.length() != b.length())
                    return (a.length() > b.length())?1:-1;
                BigInteger aB = new BigInteger(a);
                BigInteger bB = new BigInteger(b);
                return aB.compareTo(bB);
            }
        });
        for(int i = 0; i < n; i++)
            System.out.println(unsorted[i]);
    }
}
