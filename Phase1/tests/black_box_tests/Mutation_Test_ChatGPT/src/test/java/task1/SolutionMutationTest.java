/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task1;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC4 – empty string
    @Test void mt1_emptyString() {
        assertEquals(List.of(), s.separateParenGroups(""));
    }

    // EC6 – spaces only
    @Test void mt1_spacesOnly() {
        assertEquals(List.of(), s.separateParenGroups("   "));
    }

    // BVA – single pair
    @Test void mt1_singlePair() {
        assertEquals(Arrays.asList("()"), s.separateParenGroups("()"));
    }

    // Deeply nested single group (depth mutant check)
    @Test void mt1_deeplyNested() {
        assertEquals(Arrays.asList("(((())))"), s.separateParenGroups("(((())))"));
    }

    // Multiple groups – check count mutation (off-by-one)
    @Test void mt1_countGroups() {
        List<String> result = s.separateParenGroups("() () ()");
        assertEquals(3, result.size());
    }

    // Spaces inside groups – content must be stripped
    @Test void mt1_spacesInsideGroups() {
        List<String> result = s.separateParenGroups("( ) (( ))");
        assertEquals(Arrays.asList("()", "(())"), result);
    }

    // Mutation: consecutive groups without space
    @Test void mt1_adjacentGroups() {
        // Depending on implementation – at minimum must not throw
        assertDoesNotThrow(() -> s.separateParenGroups("()()"));
    }
}

