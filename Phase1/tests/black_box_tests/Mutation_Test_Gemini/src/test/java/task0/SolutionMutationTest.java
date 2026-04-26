/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task0;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC4 – single-element list (boundary: size = 1)
    @Test void mt0_singleElement() {
        assertFalse(s.hasCloseElements(Arrays.asList(3.0), 0.5));
    }

    // EC5 – threshold = 0 (boundary: threshold exactly 0)
    @Test void mt0_thresholdZero() {
        assertFalse(s.hasCloseElements(Arrays.asList(1.0, 2.0), 0.0));
    }

    // EC7 – duplicate values (difference = 0, always < any positive threshold)
    @Test void mt0_duplicates() {
        assertTrue(s.hasCloseElements(Arrays.asList(3.0, 3.0), 0.1));
    }

    // BVA – difference exactly equals threshold (strictly-less-than boundary)
    @Test void mt0_exactBoundary() {
        // |3.9 - 4.0| = 0.1, threshold = 0.1 → false (not strictly less)
        assertFalse(s.hasCloseElements(Arrays.asList(1.0, 3.9, 4.0, 10.0), 0.1));
    }

    // BVA – difference just below threshold
    @Test void mt0_justBelowThreshold() {
        assertTrue(s.hasCloseElements(Arrays.asList(1.0, 1.09), 0.1));
    }
}
