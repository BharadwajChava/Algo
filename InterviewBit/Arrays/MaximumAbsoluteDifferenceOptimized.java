/*
f(i, j) = |A[i] - A[j]| + |i - j| can be written in 4 ways (Since we are looking at max value, we don’t even care if the value becomes negative as long as we are also covering the max value in some way).

(A[i] + i) - (A[j] + j)
-(A[i] - i) + (A[j] - j) 
(A[i] - i) - (A[j] - j) 
(-A[i] - i) + (A[j] + j) = -(A[i] + i) + (A[j] + j)
Note that case 1 and 4 are equivalent and so are case 2 and 3.

We can construct two arrays with values: A[i] + i and A[i] - i. Then, for above 2 cases, we find the maximum value possible. For that, we just have to store minimum and maximum values of expressions A[i] + i and A[i] - i for all i.

*/



public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int ma1 = Integer.MIN_VALUE, mi1 = Integer.MAX_VALUE;
        int ma2 = Integer.MIN_VALUE, mi2 = Integer.MAX_VALUE;
        for(int i = 0; i < A.size(); i++){
            int x = A.get(i)+(i+1);
            int y = A.get(i)-(i+1);
            ma1 = (ma1 < x)?x:ma1;
            mi1 = (mi1 > x)?x:mi1;
            ma2 = (ma2 < y)?y:ma2;
            mi2 = (mi2 > y)?y:mi2;
        }
        return Math.max(Math.abs(ma1-mi1), Math.abs(ma2-mi2));
    }
}
