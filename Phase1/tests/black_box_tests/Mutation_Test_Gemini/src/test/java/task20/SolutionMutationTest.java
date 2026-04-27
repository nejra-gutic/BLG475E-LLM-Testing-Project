/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task20;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // BVA – exact duplicates (distance = 0)
    @Test void mt20_duplicates() {
        assertEquals(Arrays.asList(3.0, 3.0),
            s.findClosestElements(Arrays.asList(1.0, 3.0, 3.0, 7.0)));
    }

    // BVA – only two elements
    @Test void mt20_twoElements() {
        assertEquals(Arrays.asList(1.0, 2.0),
            s.findClosestElements(Arrays.asList(1.0, 2.0)));
    }

    // Mutation: returned pair must be sorted (smaller first)
    @Test void mt20_resultSorted() {
        List<Double> result = s.findClosestElements(Arrays.asList(5.0, 1.0, 3.0));
        assertTrue(result.get(0) <= result.get(1));
    }

    // Mutation: pair is not the globally closest
    @Test void mt20_globallyClosest() {
        // closest pair in [1,2,10,11] is (10,11) with distance 1
        assertEquals(Arrays.asList(10.0, 11.0),
            s.findClosestElements(Arrays.asList(1.0, 2.0, 10.0, 11.0)));
    }

    // Mutation: returns single element instead of pair
    @Test void mt20_returnsPair() {
        assertEquals(2, s.findClosestElements(Arrays.asList(1.0, 2.0, 3.0)).size());
    }

    // BVA – all elements equally spaced
    @Test void mt20_equallySpaced() {
        List<Double> result = s.findClosestElements(Arrays.asList(0.0, 1.0, 2.0, 3.0));
        // Any adjacent pair is valid; distance should be 1.0
        double dist = Math.abs(result.get(1) - result.get(0));
        assertEquals(1.0, dist, 1e-6);
    }
}
