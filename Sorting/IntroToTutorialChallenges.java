import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int i = 0;
        while(i < n){
            if(in.nextInt() == V){
                System.out.print(i);
                break;
            }
            i+=1;
        }
    }
}
