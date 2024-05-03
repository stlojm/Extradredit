public class RatioOfSums {
    public static double findRatio(int[] nums) {
        // Initialize variables for max and min numbers
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Find the largest and smallest numbers
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Calculate the sums of the largest two numbers and the smallest two numbers
        double maxSum = max1 + max2;
        double minSum = min1 + min2;

        // Return the ratio
        return maxSum / minSum;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};
        double ratio = findRatio(a);
        System.out.println("The ratio is: " + ratio);
    }
}
