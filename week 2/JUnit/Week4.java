public class Week4 {
    /**
     * max2Int method.
     * 
     * @param a int
     * @param b int
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return (a > b) ? (a) : (b);
    }

    /**
     * minArray method.
     * 
     * @param arr int[]
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int MIN = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < MIN) {
                MIN = arr[i];
            }
        }
        return MIN;
    }

    private static final double eps = 0.000001f;

    /**
     * comp method.
     * 
     * @param a double
     * @param b double
     * @return true if a <= b
     */
    private static boolean comp(double a, double b) {
        return ((b - a) >= eps); // a <= b --> b - a >= eps
    }

    /**
     * calculateBMI method.
     * 
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        if (comp(bmi, 18.5f)) {
            return "Thiếu cân";
        }
        if (comp(bmi, 22.9f)) {
            return "Bình thường";
        }
        if (comp(bmi, 24.9f)) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
}
