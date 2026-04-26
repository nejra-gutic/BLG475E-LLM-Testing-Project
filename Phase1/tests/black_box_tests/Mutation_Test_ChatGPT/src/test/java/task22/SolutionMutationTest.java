/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task22;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – only integers
    @Test void mt22_onlyIntegers() {
        assertEquals(Arrays.asList(1, 2, 3),
            s.filterIntergers(Arrays.asList(1, 2, 3)));
    }

    // EC – no integers
    @Test void mt22_noIntegers() {
        assertEquals(List.of(),
            s.filterIntergers(Arrays.asList("abc", 3.14, List.of())));
    }

    // Mutation: Double treated as Integer
    @Test void mt22_doubleNotIncluded() {
        assertEquals(List.of(),
            s.filterIntergers(Arrays.asList(3.0, 1.5)));
    }

    // BVA – single integer
    @Test void mt22_singleInteger() {
        assertEquals(Arrays.asList(42),
            s.filterIntergers(Arrays.asList(42)));
    }

    // Mutation: negative integers included
    @Test void mt22_negativeIntegers() {
        assertEquals(Arrays.asList(-1, -100),
            s.filterIntergers(Arrays.asList(-1, "x", -100)));
    }

    // BVA – empty list
    @Test void mt22_emptyList() {
        assertEquals(List.of(), s.filterIntergers(new ArrayList<>()));
    }
}