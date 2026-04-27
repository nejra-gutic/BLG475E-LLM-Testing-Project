/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task6;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC4 – empty string
    @Test void mt6_emptyString() {
        assertEquals(List.of(), s.parseNestedParens(""));
    }

    // BVA – depth 1 flat
    @Test void mt6_depthOne() {
        assertEquals(Arrays.asList(1), s.parseNestedParens("()"));
    }

    // BVA – very deep nesting
    @Test void mt6_veryDeep() {
        assertEquals(Arrays.asList(5), s.parseNestedParens("((((()))))"));
    }

    // Mutation: max depth vs current depth confusion
    @Test void mt6_nonMonotonicDepth() {
        // (()()) has max depth 2, not 1
        assertEquals(Arrays.asList(2), s.parseNestedParens("(()())"));
    }

    // Mutation: off-by-one in group count
    @Test void mt6_multipleGroupsCount() {
        List<Integer> result = s.parseNestedParens("() () () ()");
        assertEquals(4, result.size());
    }

    // Mutation: single group should produce list of size 1
    @Test void mt6_singleGroup() {
        List<Integer> result = s.parseNestedParens("((()))");
        assertEquals(1, result.size());
        assertEquals(3, (int) result.get(0));
    }
}

