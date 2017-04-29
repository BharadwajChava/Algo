public class Solution {
    private int searchIt(int[] nums, int target ){
        int m = 0;
        int n = nums.length-1;
        while(n >= m){
            int mid = (n-m)/2 + m;
            if( nums[mid] == target )
                return mid;
            else if( nums[mid] > target )
                n = mid-1;
            else
                m = mid+1;
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int f = searchIt(nums, target);
        int ar[] = {f, f};
        if(f < 0)
            return ar;
        while( ar[0] >= 0 && nums[ar[0]] == target ){
            ar[0]-=1;
        }
        while( ar[1] < nums.length && nums[ar[1]] == target )
            ar[1]+=1;
        ar[0]+=1; ar[1]-=1;
        return ar;
    }
}
