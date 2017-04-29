/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int m = 1;
        int mid = 1;
        while(n > m){
            mid = (n-m)/2;
            mid = m + mid;
            int g = guess(mid);
            if(g == 0)
                return mid;
            else if(g > 0){
                mid += 1;
                m = mid;
            }else{
                mid-=1;
                n = mid;
            }
        }
        return mid;
    }
}
