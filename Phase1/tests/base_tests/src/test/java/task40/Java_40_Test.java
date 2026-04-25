
package task40;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testTriplesSumToZero() {
        assertFalse(s.triplesSumToZero(Arrays.asList(1, 3, 5, 0)));
        assertTrue(s.triplesSumToZero(Arrays.asList(1, 3, -2, 1)));
        assertFalse(s.triplesSumToZero(Arrays.asList(1, 2, 3, 7)));
        assertTrue(s.triplesSumToZero(Arrays.asList(2, 4, -5, 3, 9, 7)));
        assertFalse(s.triplesSumToZero(Arrays.asList(1)));
    }
}