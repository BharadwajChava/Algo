public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int ref = 0;
        for(int i = 0; i < len; i++){
            if(nums[ref] == val && nums[i] != val){
                nums[ref] = nums[ref]^nums[i];
                nums[i] = nums[ref]^nums[i];
                nums[ref] = nums[ref]^nums[i];
                ref += 1;
            }else if(nums[ref]!=val)
                ref+=1;
        }
        return ref;
    }
}
