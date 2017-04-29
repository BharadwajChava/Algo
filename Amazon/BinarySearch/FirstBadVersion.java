/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int m = 1;
        int mid = 1;
        while(n > m){
            mid = (n-m)/2;
            mid = m+mid;
            if(isBadVersion(mid)){
                 n = mid;
            }else{
                mid+=1;
                m = mid;
            }
        }
        return mid;
    }
}
