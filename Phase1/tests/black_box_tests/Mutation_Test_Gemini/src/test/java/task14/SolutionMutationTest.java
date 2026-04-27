/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task14;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – single character
    @Test void mt14_singleChar() {
        assertEquals(Arrays.asList("a"), s.allPrefixes("a"));
    }

    // BVA – two characters
    @Test void mt14_twoChars() {
        assertEquals(Arrays.asList("ab", "abc"),
            s.allPrefixes("abc").subList(1, 3));  // checks middle and last
    }

    // Mutation: output count must equal string length
    @Test void mt14_countEqualsLength() {
        String str = "abcdef";
        assertEquals(str.length(), s.allPrefixes(str).size());
    }

    // Mutation: last prefix must equal input string
    @Test void mt14_lastPrefixIsInput() {
        String str = "hello";
        List<String> result = s.allPrefixes(str);
        assertEquals(str, result.get(result.size() - 1));
    }

    // Mutation: first prefix must be single character
    @Test void mt14_firstPrefixLength1() {
        List<String> result = s.allPrefixes("xyz");
        assertEquals("x", result.get(0));
    }

    // Mutation: prefixes must be in increasing order
    @Test void mt14_increasingLengths() {
        List<String> result = s.allPrefixes("abcde");
        for (int i = 0; i < result.size() - 1; i++) {
            assertEquals(result.get(i).length() + 1, result.get(i + 1).length());
        }
    }

    // Mutation: each prefix must be a prefix of the input
    @Test void mt14_eachIsActualPrefix() {
        String input = "testing";
        for (String p : s.allPrefixes(input)) {
            assertTrue(input.startsWith(p));
        }
    }
}
