public class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        if(n<0)
            return false;
        for(int i = 0; i < 32; i++){
            if( (int)(1&n) != 0 )
                count+=1;
            if(count > 1)
                break;
            n = n>>1;
        }
        return count==1?true:false;
    }
}

//Try other 3 or 4
