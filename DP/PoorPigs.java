public class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets == 1)
            return 0;
        int base = minutesToTest/minutesToDie + 1;
        int count = 0;
        while(buckets > Math.pow(base, count)){
            count+=1;
        }
        return count;
    }
}
