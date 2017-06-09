public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        int[] a = {5, 6, 7 , 8 , 1, 2, 3, 4};
        int len  = a.length;
        int key = 4;
        int mi = 0, ma = len-1;
        while(mi <= ma){
            int mid = (ma - mi)/2 + mi;
            if(a[mid] > key){
                if(a[mi] < a[mid] && a[mi]<=key || a[ma] > a[mid] && key<=a[ma])
                    ma = mid-1;
                else
                    mi = mid+1;
            }else if(a[mid] < key){
                if(a[ma] > a[mid] && key<=a[ma] || a[mi] < a[mid] && a[mi]<=key)
                    mi = mid+1;
                else
                    ma = mid-1;
            }else{
                System.out.println(a[mid] + "  " + mid);  
                break;
            }
        }
    }
}
