import java.util.*;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int maximum = nums[0];
        int minimum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maximum) {
                maximum = nums[i];
            } else if (nums[i] < minimum) {
                minimum = nums[i];
            }
        }

        return maximum - minimum;
    }

    public static String longestWord(ArrayList<String> list, char character) {
        return "";
    }

    public static int countWords(HashSet<String> set, int n, int m) {
        return 0;
    }

    public static int oddEvenDifferent(HashMap<String, Integer> map) {
        return 0;
    }

    public static int secondLargest(HashMap<Integer, String> map) {
        return 0;
    }
}
