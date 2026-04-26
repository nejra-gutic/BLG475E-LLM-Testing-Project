package task12;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testLongest() {
        Solution s = new Solution();

        assertTrue(s.longest(List.of()).isEmpty());
        assertEquals("x", s.longest(Arrays.asList("x", "y", "z")).get());
        assertEquals("zzzz", s.longest(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc")).get());
    }
}