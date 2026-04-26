package task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testTruncateNumber() {
        Solution s = new Solution();

        assertEquals(0.5, s.truncateNumber(3.5), 1e-6);
        assertEquals(0.33, s.truncateNumber(1.33), 1e-6);
        assertEquals(0.456, s.truncateNumber(123.456), 1e-6);
    }
}