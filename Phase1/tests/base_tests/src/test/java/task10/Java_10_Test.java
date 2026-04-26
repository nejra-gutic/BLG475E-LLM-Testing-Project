package task10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testMakePalindrome() {
        Solution s = new Solution();

        assertEquals("", s.makePalindrome(""));
        assertEquals("x", s.makePalindrome("x"));
        assertEquals("xyzyx", s.makePalindrome("xyz"));
        assertEquals("xyx", s.makePalindrome("xyx"));
        assertEquals("jerryrrej", s.makePalindrome("jerry"));
    }
}