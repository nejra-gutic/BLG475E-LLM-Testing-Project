/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task18;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – substring not in string
    @Test void mt18_noOccurrence() {
        assertEquals(0, s.howManyTimes("hello", "xyz"));
    }

    // EC – empty string with any substring
    @Test void mt18_emptyString() {
        assertEquals(0, s.howManyTimes("", "x"));
    }

    // BVA – substring same as string
    @Test void mt18_equalStrings() {
        assertEquals(1, s.howManyTimes("abc", "abc"));
    }

    // Mutation: non-overlapping vs overlapping (test overlapping case)
    @Test void mt18_overlapping() {
        // "aaa" contains "aa" twice (positions 0 and 1) – overlapping
        assertEquals(2, s.howManyTimes("aaa", "aa"));
    }

    // BVA – substring at start only
    @Test void mt18_atStart() {
        assertEquals(1, s.howManyTimes("abcdef", "abc"));
    }

    // BVA – substring at end only
    @Test void mt18_atEnd() {
        assertEquals(1, s.howManyTimes("abcdef", "def"));
    }

    // Mutation: off-by-one in search
    @Test void mt18_consecutiveOccurrences() {
        // "abab" contains "ab" at positions 0 and 2 → 2 times
        assertEquals(2, s.howManyTimes("abab", "ab"));
    }

    // BVA – single character substring
    @Test void mt18_singleCharSubstring() {
        assertEquals(3, s.howManyTimes("banana", "a"));
    }
}
