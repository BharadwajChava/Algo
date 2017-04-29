public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int x = 1;
        long val = 0;
        for(int i = 0; i < 32; i++){
            if( (int)(x&n) != 0)
                val = val+(long)Math.pow(2, 31-i); 
            n = n>>1;
        }
        return (int)val;
    }
}
