/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task5;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC3 – single element (no delimiter inserted)
    @Test void mt5_singleElement() {
        assertEquals(Arrays.asList(5), s.intersperse(Arrays.asList(5), 4));
    }

    // EC4 – two elements
    @Test void mt5_twoElements() {
        assertEquals(Arrays.asList(1, 0, 2), s.intersperse(Arrays.asList(1, 2), 0));
    }

    // BVA – delimiter = 0
    @Test void mt5_delimiterZero() {
        assertEquals(Arrays.asList(1, 0, 2, 0, 3), s.intersperse(Arrays.asList(1, 2, 3), 0));
    }

    // BVA – delimiter = Integer.MIN_VALUE
    @Test void mt5_delimiterMinValue() {
        List<Integer> result = s.intersperse(Arrays.asList(1, 2), Integer.MIN_VALUE);
        assertEquals(Arrays.asList(1, Integer.MIN_VALUE, 2), result);
    }

    // BVA – delimiter = Integer.MAX_VALUE
    @Test void mt5_delimiterMaxValue() {
        List<Integer> result = s.intersperse(Arrays.asList(1, 2), Integer.MAX_VALUE);
        assertEquals(Arrays.asList(1, Integer.MAX_VALUE, 2), result);
    }

    // Mutation: check output length = 2*n - 1
    @Test void mt5_outputLength() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = s.intersperse(input, 9);
        assertEquals(9, result.size()); // 2*5-1 = 9
    }

    // Mutation: delimiter placed at wrong positions
    @Test void mt5_delimiterPositions() {
        List<Integer> result = s.intersperse(Arrays.asList(10, 20, 30), 99);
        assertEquals(10, (int) result.get(0));
        assertEquals(99, (int) result.get(1));
        assertEquals(20, (int) result.get(2));
        assertEquals(99, (int) result.get(3));
        assertEquals(30, (int) result.get(4));
    }
}

