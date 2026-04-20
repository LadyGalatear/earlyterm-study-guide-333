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
        // look only for words that start with character in array
        // count number of letters in word
        // save longest

        String longest = "";
        String letter = String.valueOf(character);

        for (String word : list) {
            if (word.startsWith(letter)) {
                if (longest.length() < word.length()) {
                    longest = word;
                }
            }
        }

        return longest;
    }

    public static int countWords(HashSet<String> set, int n, int m) {
        int count = 0;

        for (String word : set) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }

        return count;
    }

    public static int oddEvenDifferent(HashMap<String, Integer> map) {
        int odds = 0;
        int evens = 0;

        for (Integer value : map.values()) {
            if (value % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }

        return odds - evens;
    }

    public static int secondLargest(HashMap<Integer, String> map) {
        return 0;
    }
}
