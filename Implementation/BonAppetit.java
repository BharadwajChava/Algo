import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0, ele = 0;
        for(int i = 0; i < n; i++){
            if(i != m)
                sum+=in.nextInt();
            else
                ele = in.nextInt();
        }
        m = in.nextInt();
        System.out.print((m-sum/2 > 0)?(m-sum/2):"Bon Appetit");
    }
}
