/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task35;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – single element
    @Test void mt35_singleElement() {
        assertEquals(42, s.maxElement(Arrays.asList(42)));
    }

    // EC – all identical
    @Test void mt35_allIdentical() {
        assertEquals(7, s.maxElement(Arrays.asList(7, 7, 7)));
    }

    // BVA – max at beginning
    @Test void mt35_maxAtStart() {
        assertEquals(100, s.maxElement(Arrays.asList(100, 1, 2, 3)));
    }

    // BVA – max at end
    @Test void mt35_maxAtEnd() {
        assertEquals(100, s.maxElement(Arrays.asList(1, 2, 3, 100)));
    }

    // Mutation: min instead of max
    @Test void mt35_notMin() {
        int result = s.maxElement(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
        assertEquals(9, result);
        assertNotEquals(1, result);
    }

    // BVA – two elements
    @Test void mt35_twoElements() {
        assertEquals(5, s.maxElement(Arrays.asList(3, 5)));
        assertEquals(5, s.maxElement(Arrays.asList(5, 3)));
    }
}
