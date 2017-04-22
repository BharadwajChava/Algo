import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int l = ar.length;
        int e = ar[l-1];
        for(int i = l-2; i >= 0; i--){
            if(ar[i] > ar[i+1]){
                for(int j = 0; j < l; j++){
                    if(j == i+1)
                        System.out.print(ar[i]+" ");
                    else
                        System.out.print(ar[j]+" ");
                }
                System.out.print("\n");
                int temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }
        }
        for(int i = 0; i < l; i++)
            System.out.print(ar[i] + " ");
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
