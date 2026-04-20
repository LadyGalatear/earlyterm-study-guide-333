import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
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

    // TODO: Make tests for each problem you solve
    
}


