public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];
        }
        int bit = xor&(~(xor-1));
        int[] ar = {0, 0};
        for(int i = 0; i < nums.length; i++){
            if( (int)(nums[i]&bit) > 0){
                ar[0] = ar[0]^nums[i];
            }else{
                ar[1] = ar[1]^nums[i];
            }
        }
        return ar;
    }
}
