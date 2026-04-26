package task32;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testFindZero() {
        assertEquals(-0.5, s.findZero(Arrays.asList(1.0, 2.0)), 1e-4);
        assertEquals(1.0, s.findZero(Arrays.asList(-6.0, 11.0, -6.0, 1.0)), 1e-4);
    }
}