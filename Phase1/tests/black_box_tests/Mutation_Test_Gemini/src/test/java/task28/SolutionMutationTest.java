/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task28;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – single string
    @Test void mt28_singleString() {
        assertEquals("hello", s.concatenate(Arrays.asList("hello")));
    }

    // BVA – two strings
    @Test void mt28_twoStrings() {
        assertEquals("ab", s.concatenate(Arrays.asList("a", "b")));
    }

    // EC – strings containing spaces
    @Test void mt28_withSpaces() {
        assertEquals("hello world", s.concatenate(Arrays.asList("hello ", "world")));
    }

    // Mutation: separator inserted between elements
    @Test void mt28_noSeparator() {
        // Must NOT add any separator
        assertEquals("abc", s.concatenate(Arrays.asList("a", "b", "c")));
    }

    // EC – empty strings in list
    @Test void mt28_emptyStringsInList() {
        assertEquals("ab", s.concatenate(Arrays.asList("", "a", "", "b", "")));
    }
}
