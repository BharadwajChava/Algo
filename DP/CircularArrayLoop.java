public class Solution {
    public static boolean circularArrayLoop(int[] nums) {
        if(nums.length == 0)
            return false;
        int i = 0;
        int v = nums[0] > 0?  1 : -1;
        while(i < nums.length){      
            if(v == -1)
                nums[i] = (-1)*nums[i];
            if(v == 1 && nums[i]<0)
                return false;
            else if(v == -1 && nums[i]>0)
                return false;
            i = i + nums[i];
        }
        return true;
    }
}
