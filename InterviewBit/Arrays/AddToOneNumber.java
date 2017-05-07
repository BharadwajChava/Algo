import java.math.BigInteger;
public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    int r = 1;
	    for(int i = a.size()-1; i >= 0; i++){
	        int x = a.get(i);
	        x+=r;
	        r = x/10;
	        a.set(i, x%10);
	    }
	    if(r != 0)
	        a.add(0, r);
	    else{
	        
	    }
	}
}
