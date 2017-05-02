public class Solution {
    public int mySqrt(int x) {
        int n = x;
        int m = 0;
        while(n >= m){
            int mid = (n-m)/2 + m;
            long y = (long)mid*(long)mid;
            if(y < x){
                m = mid+1;
            }else if(y > x){
                n = mid-1;
            }else
                return mid;
        }
        return m-1;
    }
}
