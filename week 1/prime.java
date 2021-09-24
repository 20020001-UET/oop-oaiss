// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * Return true if {@code n} is prime number.
     * 
     * @param n is a integer number.
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

} 
