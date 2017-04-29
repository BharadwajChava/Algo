public class Solution {
    public boolean isPerfectSquare(int num) {
        int m = 1;
        int n = num;
        while(n >= m){
            long mid = (n-m)/2 + m;
            long mul = mid * mid;
            if(mul == num)
                return true;
            else if(mul > num)
                n = (int)mid-1;
            else
                m = (int)mid+1;
        }
        return false;
    }
}
