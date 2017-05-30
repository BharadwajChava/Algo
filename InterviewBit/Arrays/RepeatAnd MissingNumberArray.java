public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    long len = a.size();
	    long sum = (len * (len+1))/2;
	    long sum2 = 0;
	    for (int i = 0; i < len; i++)
	        sum2 += a.get(i);
	    double j = len;
	    double mul = 1;
	    for(int i = 0; i < len; i++){
	        mul *= a.get(i);
	        while(mul >= (double)Integer.MAX_VALUE && j > 0){
	            mul = mul/j;
	            j-=1;
	        }
	    }while(j > 0){
	        mul = mul/j;
	        j-=1;
	    }
	    int a1 = 0, b = (int)Math.round(((double)(sum2 - sum))/(mul - 1));
	    for(int i = 0;i<len; i++){
	        a1 = a1 ^ (i+1) ^ a.get(i);
	    }
	    ArrayList<Integer> aa = new ArrayList<Integer>();
	    aa.add(a1^b);
	    aa.add(b);
	    return aa;
	}
}
