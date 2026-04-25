package task3;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testBelowZero() {
        Solution s = new Solution();

        assertFalse(s.belowZero(new ArrayList<>()));
        assertFalse(s.belowZero(Arrays.asList(1, 2, -3, 1, 2, -3)));
        assertTrue(s.belowZero(Arrays.asList(1, 2, -4, 5, 6)));
        assertFalse(s.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4)));
        assertTrue(s.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5)));
        assertTrue(s.belowZero(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4)));
    }
}