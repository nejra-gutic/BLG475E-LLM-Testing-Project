/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task7;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC2 – substring in all elements
    @Test void mt7_matchesAll() {
        assertEquals(Arrays.asList("aa", "ab"),
            s.filterBySubstring(Arrays.asList("aa", "ab"), "a"));
    }

    // EC3 – substring in none
    @Test void mt7_matchesNone() {
        assertEquals(List.of(), s.filterBySubstring(Arrays.asList("xyz", "abc"), "q"));
    }

    // EC5 – empty substring (matches all)
    @Test void mt7_emptySubstring() {
        List<String> input = Arrays.asList("hello", "world");
        assertEquals(input, s.filterBySubstring(input, ""));
    }

    // EC6 – case sensitivity
    @Test void mt7_caseSensitive() {
        assertEquals(List.of(), s.filterBySubstring(Arrays.asList("ABC"), "abc"));
    }

    // EC7 – substring longer than element
    @Test void mt7_substringLonger() {
        assertEquals(List.of(), s.filterBySubstring(Arrays.asList("ab"), "abc"));
    }

    // BVA – substring = exact element
    @Test void mt7_exactMatch() {
        assertEquals(Arrays.asList("hello"),
            s.filterBySubstring(Arrays.asList("hello", "world"), "hello"));
    }
}
