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
}
