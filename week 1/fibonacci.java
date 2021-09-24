// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * Return the n-th fibonacci. If {@code n < 0} return {@code -1}.
     * 
     * @param n is the numbering.
     */
    public static long fibonacci(long n) {
        int cur = 1;
        if (n < 0) {
            return -1;
        }
        if (cur > n) {
            return 0;
        }
        long pre = 1;
        long ppre = 0;
        while (cur < n) {
            cur++;
            long tmp = pre + ppre;
            if (ppre > Long.MAX_VALUE - pre) {
                return Long.MAX_VALUE;
            }
            ppre = pre;
            pre = tmp;
        }
        return pre;
    }
} 
