/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task16;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – empty string
    @Test void mt16_emptyString() {
        assertEquals(0, s.countDistinctCharacters(""));
    }

    // EC – all same characters
    @Test void mt16_allSame() {
        assertEquals(1, s.countDistinctCharacters("aaaa"));
    }

    // EC – all distinct
    @Test void mt16_allDistinct() {
        assertEquals(5, s.countDistinctCharacters("abcde"));
    }

    // Mutation: case folding – 'A' and 'a' count as same
    @Test void mt16_caseInsensitive() {
        assertEquals(1, s.countDistinctCharacters("aAaAaA"));
    }

    // EC – includes spaces
    @Test void mt16_withSpaces() {
        // "a b" has 'a', ' ', 'b' → 3 distinct (case-insensitive)
        assertEquals(3, s.countDistinctCharacters("a b"));
    }

    // BVA – single character
    @Test void mt16_singleChar() {
        assertEquals(1, s.countDistinctCharacters("Z"));
    }

    // Mutation: count vs set size confusion
    @Test void mt16_repeatedChars() {
        assertEquals(3, s.countDistinctCharacters("aaabbbccc"));
    }

    // Mutation: mixed case
    @Test void mt16_mixedCase() {
        assertEquals(3, s.countDistinctCharacters("AaBbCc"));
    }
}
