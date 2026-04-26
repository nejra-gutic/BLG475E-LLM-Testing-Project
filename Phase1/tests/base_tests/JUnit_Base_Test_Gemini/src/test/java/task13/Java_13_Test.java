package task13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testGCD() {
        Solution s = new Solution();

        assertEquals(1, s.greatestCommonDivisor(3, 7));
        assertEquals(5, s.greatestCommonDivisor(10, 15));
        assertEquals(7, s.greatestCommonDivisor(49, 14));
        assertEquals(12, s.greatestCommonDivisor(144, 60));
    }
}