package task43;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testPairsSumToZero() {
        assertFalse(s.pairsSumToZero(Arrays.asList(1, 3, 5, 0)));
        assertFalse(s.pairsSumToZero(Arrays.asList(1, 3, -2, 1)));
        assertFalse(s.pairsSumToZero(Arrays.asList(1, 2, 3, 7)));
        assertTrue(s.pairsSumToZero(Arrays.asList(2, 4, -5, 3, 5, 7)));
        assertFalse(s.pairsSumToZero(Arrays.asList(1)));
    }
}