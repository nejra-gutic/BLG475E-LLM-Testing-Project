package task35;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testMaxElement() {
        assertEquals(3, s.maxElement(Arrays.asList(1, 2, 3)));
        assertEquals(124, s.maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10)));
    }
}
