/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task3;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC4 – balance hits exactly zero (not below)
    @Test void mt3_exactlyZero() {
        assertFalse(s.belowZero(Arrays.asList(5, -5)));
    }

    // EC5 – all negative from the start
    @Test void mt3_allNegative() {
        assertTrue(s.belowZero(Arrays.asList(-1, -2, -3)));
    }

    // EC6 – goes below on last operation
    @Test void mt3_belowOnLastOp() {
        assertTrue(s.belowZero(Arrays.asList(5, -6)));
    }

    // BVA – single negative operation
    @Test void mt3_singleNegative() {
        assertTrue(s.belowZero(Arrays.asList(-1)));
    }

    // BVA – single positive operation
    @Test void mt3_singlePositive() {
        assertFalse(s.belowZero(Arrays.asList(10)));
    }
}
