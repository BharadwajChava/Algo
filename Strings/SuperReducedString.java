import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.next());
        int i = 0;
        while(i < s.length()){
            if(i != 0){
                if(s.charAt(i) == s.charAt(i-1)){
                    s.delete(i-1, i+1);
                    i-=2;
                }
            }
            i+=1;
        }
        System.out.println(s.length() == 0 ? "Empty String" : s);
    }
}
