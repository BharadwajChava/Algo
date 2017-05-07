public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    long maxSum = Long.MIN_VALUE, sum = 0;
	    int i = 0;
	    while(i < a.size()){
	        sum = sum + a.get(i);
	        if(sum > maxSum){
	            maxSum = sum;
	        }
	        if(sum < 0){
	           sum = 0;
	        }
	        i+=1;
	    }
	    return (int)maxSum;
	}
}
