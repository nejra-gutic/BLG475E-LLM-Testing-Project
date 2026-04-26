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

    // Mutation: returns single element instead of pair
    @Test void mt20_returnsPair() {
        assertEquals(2, s.findClosestElements(Arrays.asList(1.0, 2.0, 3.0)).size());
    }
}