/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task9;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC5 – single element
    @Test void mt9_singleElement() {
        assertEquals(Arrays.asList(5), s.rollingMax(Arrays.asList(5)));
    }

    // EC6 – all equal elements
    @Test void mt9_allEqual() {
        assertEquals(Arrays.asList(3, 3, 3), s.rollingMax(Arrays.asList(3, 3, 3)));
    }

    // EC7 – all negative numbers
    @Test void mt9_allNegative() {
        assertEquals(Arrays.asList(-5, -3, -3), s.rollingMax(Arrays.asList(-5, -3, -7)));
    }

    // BVA – max is at last position only
    @Test void mt9_maxAtEnd() {
        assertEquals(Arrays.asList(1, 2, 3, 100),
            s.rollingMax(Arrays.asList(1, 2, 3, 100)));
    }

    // Mutation: rolling max should not decrease
    @Test void mt9_monotonicNonDecreasing() {
        List<Integer> result = s.rollingMax(Arrays.asList(5, 3, 8, 2, 9, 1));
        for (int i = 1; i < result.size(); i++) {
            assertTrue(result.get(i) >= result.get(i - 1));
        }
    }
}
