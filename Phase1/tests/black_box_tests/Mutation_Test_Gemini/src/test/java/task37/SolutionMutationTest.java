/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task37;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – single element (no change)
    @Test void mt37_singleElement() {
        assertEquals(Arrays.asList(5),
            s.sortEven(new ArrayList<>(Arrays.asList(5))));
    }

    // EC – odd-indexed elements unchanged
    @Test void mt37_oddIndicesUnchanged() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 99, 3, 88, 1));
        List<Integer> result = s.sortEven(input);
        // Odd indices: 99 and 88 must remain at indices 1 and 3
        assertEquals(99, (int) result.get(1));
        assertEquals(88, (int) result.get(3));
    }

    // EC – even-indexed elements must be sorted
    @Test void mt37_evenIndicesSorted() {
        List<Integer> input = new ArrayList<>(Arrays.asList(9, 10, 1, 20, 5));
        List<Integer> result = s.sortEven(input);
        // Even indices: 9,1,5 → sorted: 1,5,9
        assertEquals(1, (int) result.get(0));
        assertEquals(5, (int) result.get(2));
        assertEquals(9, (int) result.get(4));
    }

    // Mutation: sorting odd-indexed instead of even-indexed
    @Test void mt37_onlyEvenModified() {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 100, 1, 200));
        List<Integer> result = s.sortEven(input);
        // Odd indices 100, 200 unchanged
        assertEquals(100, (int) result.get(1));
        assertEquals(200, (int) result.get(3));
    }

    // BVA – two elements
    @Test void mt37_twoElements() {
        assertEquals(Arrays.asList(3, 4),
            s.sortEven(new ArrayList<>(Arrays.asList(3, 4))));
    }

    // EC – all even indices out of order
    @Test void mt37_reverseEvenIndices() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 0, 3, 0, 1));
        List<Integer> result = s.sortEven(input);
        List<Integer> evenVals = Arrays.asList((int) result.get(0), (int) result.get(2), (int) result.get(4));
        assertEquals(Arrays.asList(1, 3, 5), evenVals);
    }
}
