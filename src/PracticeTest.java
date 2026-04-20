import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxWithNum0Only() {
        int[] numbers = {3};
        int actual = Practice.maxDiff(numbers);
        assertEquals(0, actual);
    }
    
    @Test
    void testMaxAt0() {
        int[] numbers = {15, 5, 4, 3, 1, 0};
        int actual = Practice.maxDiff(numbers);
        assertEquals(15, actual);
    }

    @Test
    void testMinAt0() {
        int[] numbers = {0, 1, 3, 5, 7, 15};
        int actual = Practice.maxDiff(numbers);
        assertEquals(15, actual);
    }

    @Test
    void testMaxWithRepeatedValue() {
        int[] numbers = {3, 3, 3, 3, 3};
        int actual = Practice.maxDiff(numbers);
        assertEquals(0, actual);
    }

    @Test
    void testLongest1Word() {
        ArrayList<String> list = new ArrayList<>();
        list.add("anenome");
        char letter = 'a';
        String actual = Practice.longestWord(list, letter);
        assertEquals("anenome", actual);
    }

    @Test
    void testLongest3Word() {
        ArrayList<String> list = new ArrayList<>();
        list.add("baseball");
        list.add("basketball");
        list.add("bowling");
        char letter = 'b';
        String actual = Practice.longestWord(list, letter);
        assertEquals("basketball", actual);
    }

    @Test
    void testCountWords() {
        HashSet<String> set = new HashSet<>();
        set.add("go");
        set.add("violin");
        set.add("right");
        set.add("now");
        int n = 2;
        int m = 6;
        int actual = Practice.countWords(set, n, m);
        assertEquals(2, actual);
    }

    @Test
    void testOddEvenDifferent() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("that", 4);
        map.put("boy", 3);
        map.put("ain't", 5);
        map.put("right", 5);
        int actual = Practice.oddEvenDifferent(map);
        assertEquals(2, actual);
    }

    @Test
    void testSecondLargest() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "4");
        map.put(3, "");
        map.put(9, "gogogo");
        map.put(1, "I am the alpha and the omega");
        int actual = Practice.secondLargest(map);
        assertEquals(5, actual);
    }


}