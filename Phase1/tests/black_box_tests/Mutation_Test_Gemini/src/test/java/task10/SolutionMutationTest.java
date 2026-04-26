/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task10;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC1 – already a palindrome
    @Test void mt10_alreadyPalindrome() {
        assertEquals("racecar", s.makePalindrome("racecar"));
    }

    // EC1 – single character
    @Test void mt10_singleChar() {
        assertEquals("a", s.makePalindrome("a"));
    }

    // EC – two-char non-palindrome
    @Test void mt10_twoCharsNonPalindrome() {
        assertEquals("aba", s.makePalindrome("ab"));
    }

    // EC – two identical chars
    @Test void mt10_twoIdentical() {
        assertEquals("aa", s.makePalindrome("aa"));
    }

    // BVA – empty string
    @Test void mt10_emptyString() {
        assertEquals("", s.makePalindrome(""));
    }

    // Mutation: result must start with the original string
    @Test void mt10_startsWithOriginal() {
        String input = "xyz";
        String result = s.makePalindrome(input);
        assertTrue(result.startsWith(input));
    }
}