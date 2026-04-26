/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task12;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – all same length (first one wins)
    @Test void mt12_allSameLength() {
        assertEquals("aaa", s.longest(Arrays.asList("aaa", "bbb", "ccc")).get());
    }

    // EC – single element list
    @Test void mt12_singleElement() {
        assertEquals("hello", s.longest(Arrays.asList("hello")).get());
    }

    // BVA – two elements
    @Test void mt12_twoElements() {
        assertEquals("bb", s.longest(Arrays.asList("a", "bb")).get());
    }

    // Mutation: empty string vs non-empty
    @Test void mt12_emptyAndNonEmpty() {
        assertEquals("a", s.longest(Arrays.asList("", "a")).get());
    }

    // BVA – longest at beginning
    @Test void mt12_longestFirst() {
        assertEquals("zzzzz", s.longest(Arrays.asList("zzzzz", "b", "cc")).get());
    }

    // BVA – longest at end
    @Test void mt12_longestLast() {
        assertEquals("zzzzz", s.longest(Arrays.asList("b", "cc", "zzzzz")).get());
    }
}
