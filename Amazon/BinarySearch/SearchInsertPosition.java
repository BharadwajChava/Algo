public class Solution {
    public int searchInsert(int[] nums, int target) {
        int m = 0;
        int n = nums.length-1;
        int mid = 0;
        while(n > m){
            mid = (n-m)/2;
            mid = mid + m;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                mid -= 1;
                n = mid;
            }else{
                mid+=1;
                m= mid;
            }
        }
        if(mid == -1 || nums[mid] < target)
            mid+=1;
        return mid;
    }
}
