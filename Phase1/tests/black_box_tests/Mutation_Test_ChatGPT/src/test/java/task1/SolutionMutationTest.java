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

}
