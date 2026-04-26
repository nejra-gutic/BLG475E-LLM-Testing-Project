package task24;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testLargestDivisor() {
        assertEquals(1, s.largestDivisor(3));
        assertEquals(1, s.largestDivisor(7));
        assertEquals(5, s.largestDivisor(10));
        assertEquals(50, s.largestDivisor(100));
        assertEquals(7, s.largestDivisor(49));
    }
}