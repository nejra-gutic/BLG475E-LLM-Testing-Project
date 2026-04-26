/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task19;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – all same number word
    @Test void mt19_allSame() {
        assertEquals("three three three", s.sortNumbers("three three three"));
    }

    // EC – already sorted
    @Test void mt19_alreadySorted() {
        assertEquals("zero one two", s.sortNumbers("zero one two"));
    }

    // BVA – single word
    @Test void mt19_singleWord() {
        assertEquals("five", s.sortNumbers("five"));
    }

    // EC – empty string
    @Test void mt19_emptyString() {
        assertEquals("", s.sortNumbers(""));
    }

    // Mutation: ascending vs descending order
    @Test void mt19_ascendingOrder() {
        String result = s.sortNumbers("nine zero five");
        assertEquals("zero five nine", result);
    }
}
