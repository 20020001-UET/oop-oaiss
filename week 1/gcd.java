// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * Return the greatest common divisor of two integer {@code a} and {@code b}.
     * 
     * @param a is the first integer.
     * @param b is the second integer.
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }
} 
