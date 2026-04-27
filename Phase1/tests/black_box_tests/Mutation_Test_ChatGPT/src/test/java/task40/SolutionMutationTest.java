/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task40;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – exactly three elements that sum to zero
    @Test void mt40_exactlyThreeZeroSum() {
        assertTrue(s.triplesSumToZero(Arrays.asList(-1, 0, 1)));
    }

    // EC – exactly three elements that don't sum to zero
    @Test void mt40_threeElementsNoZeroSum() {
        assertFalse(s.triplesSumToZero(Arrays.asList(1, 2, 3)));
    }

    // BVA – two elements only (not enough for a triple)
    @Test void mt40_twoElements() {
        assertFalse(s.triplesSumToZero(Arrays.asList(0, 0)));
    }

    // EC – all zeros (0+0+0 = 0)
    @Test void mt40_allZeros() {
        assertTrue(s.triplesSumToZero(Arrays.asList(0, 0, 0)));
    }

    // Mutation: same index used twice (indices must be distinct)
    @Test void mt40_distinctIndices() {
        // [0, 1, 2] – 0+0+0 requires same element 3 times at same index → false
        assertFalse(s.triplesSumToZero(Arrays.asList(0, 1, 2)));
    }

    // EC – large list with no valid triple
    @Test void mt40_allPositiveNoZeroSum() {
        assertFalse(s.triplesSumToZero(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
    }

    // BVA – triple at end of list
    @Test void mt40_tripleAtEnd() {
        assertTrue(s.triplesSumToZero(Arrays.asList(10, 20, 30, -1, 0, 1)));
    }

    // Mutation: pairs vs triples confusion
    @Test void mt40_onlyPairSums() {
        // 1 + (-1) = 0 but no TRIPLE sums to zero
        assertFalse(s.triplesSumToZero(Arrays.asList(1, -1, 2, 3)));
    }
}
