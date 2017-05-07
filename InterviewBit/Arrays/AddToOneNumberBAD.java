import java.math.BigInteger;
public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    String s = "0";
	    for(int i = 0; i < a.size(); i++){
	        s = s + a.get(i);
	    }
	    BigInteger b = new BigInteger(s);
	    b = b.add(new BigInteger("1"));
	    s = b.toString();
	    a.clear();
	    for(int i = 0; i < s.length(); i++){
	        a.add(Integer.parseInt(s.charAt(i)+""));
	    }
	    return a;
	}
}
