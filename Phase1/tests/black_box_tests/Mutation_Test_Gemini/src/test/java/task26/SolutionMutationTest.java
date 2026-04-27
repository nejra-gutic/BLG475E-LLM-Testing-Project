/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task26;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – all elements appear more than once
    @Test void mt26_allDuplicates() {
        assertEquals(List.of(),
            s.removeDuplicates(Arrays.asList(1, 1, 2, 2, 3, 3)));
    }

    // EC – single element (no duplicates)
    @Test void mt26_singleElement() {
        assertEquals(Arrays.asList(7), s.removeDuplicates(Arrays.asList(7)));
    }

    // BVA – two identical elements
    @Test void mt26_twoIdentical() {
        assertEquals(List.of(), s.removeDuplicates(Arrays.asList(5, 5)));
    }

    // BVA – two different elements
    @Test void mt26_twoDifferent() {
        assertEquals(Arrays.asList(1, 2), s.removeDuplicates(Arrays.asList(1, 2)));
    }

    // Mutation: remove one occurrence vs remove all occurrences
    @Test void mt26_triplicateRemoved() {
        assertEquals(List.of(),
            s.removeDuplicates(Arrays.asList(9, 9, 9)));
    }

    // Mutation: order preservation
    @Test void mt26_orderPreserved() {
        assertEquals(Arrays.asList(3, 7, 1),
            s.removeDuplicates(Arrays.asList(3, 2, 7, 2, 1)));
    }

    // EC – no duplicates at all
    @Test void mt26_noDuplicates() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5),
            s.removeDuplicates(Arrays.asList(1, 2, 3, 4, 5)));
    }

    // Mutation: negative numbers
    @Test void mt26_negativeNumbers() {
        assertEquals(Arrays.asList(-3),
            s.removeDuplicates(Arrays.asList(-1, -1, -3)));
    }
}
