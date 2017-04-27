import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < len; i++)
            m.put(nums[i], i);
        for(int i = 0; i < len; i++){
            int x = target-nums[i];
            if(m.containsKey(x) && m.get(x) != i){
                int[] a = new int[2];
                a[0] = i;
                a[1] = m.get(x);
                return a;
            }
        }
        return nums;
    }
}
