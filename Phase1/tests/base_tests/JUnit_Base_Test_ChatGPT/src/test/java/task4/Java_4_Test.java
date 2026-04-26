package task4;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testMeanAbsoluteDeviation() {
        Solution s = new Solution();

        assertEquals(2.0/3.0, s.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0)), 1e-6);
        assertEquals(1.0, s.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0)), 1e-6);
        assertEquals(6.0/5.0, s.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)), 1e-6);
    }
}