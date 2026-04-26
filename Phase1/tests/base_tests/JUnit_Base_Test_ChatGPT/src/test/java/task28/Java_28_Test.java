package task28;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testConcatenate() {
        assertEquals("", s.concatenate(List.of()));
        assertEquals("xyz", s.concatenate(Arrays.asList("x", "y", "z")));
        assertEquals("xyzwk", s.concatenate(Arrays.asList("x", "y", "z", "w", "k")));
    }
}