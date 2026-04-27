/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task30;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // BVA – zero excluded (not positive)
    @Test void mt30_zeroExcluded() {
        assertEquals(List.of(), s.getPositive(Arrays.asList(0)));
    }

    // BVA – single positive
    @Test void mt30_singlePositive() {
        assertEquals(Arrays.asList(1), s.getPositive(Arrays.asList(1)));
    }

    // BVA – single negative
    @Test void mt30_singleNegative() {
        assertEquals(List.of(), s.getPositive(Arrays.asList(-1)));
    }

    // Mutation: >= 0 instead of > 0 (zero should not be included)
    @Test void mt30_zeroNotIncluded() {
        assertFalse(s.getPositive(Arrays.asList(-3, 0, 3)).contains(0));
    }

    // Mutation: order preservation
    @Test void mt30_orderPreserved() {
        assertEquals(Arrays.asList(3, 1, 4, 2),
            s.getPositive(Arrays.asList(-5, 3, -2, 1, 4, -9, 2)));
    }

    // EC – all positive
    @Test void mt30_allPositive() {
        assertEquals(Arrays.asList(1, 2, 3), s.getPositive(Arrays.asList(1, 2, 3)));
    }

    // EC – all negative
    @Test void mt30_allNegative() {
        assertEquals(List.of(), s.getPositive(Arrays.asList(-1, -2, -3)));
    }

    // BVA – Integer.MAX_VALUE is positive
    @Test void mt30_maxValue() {
        assertEquals(Arrays.asList(Integer.MAX_VALUE),
            s.getPositive(Arrays.asList(-1, Integer.MAX_VALUE)));
    }
}
