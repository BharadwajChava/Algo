import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int j = i-1;
            int val = A[i];
            while(j >= 0 && A[j] > val){
                A[j+1] = A[j];
                j-=1;
            }
            A[j+1] = val;
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
