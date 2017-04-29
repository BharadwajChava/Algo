public class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for(int i = 0; i < 32; i++){
            int sum = 0;
            for(int j = 0; j < nums.length; j++){
                if( ((nums[j]>>i) & 1) == 1 ){
                    sum++;
                    sum = sum%3;
                }
            }
            if(sum != 0)
                x = x | sum<<i;
        }
        return x;
    }
}


// All numbers are except one number. This works for any kind of problem.
