package task9;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testRollingMax() {
        Solution s = new Solution();

        assertEquals(List.of(), s.rollingMax(List.of()));
        assertEquals(Arrays.asList(1, 2, 3, 4),
                s.rollingMax(Arrays.asList(1, 2, 3, 4)));
        assertEquals(Arrays.asList(4, 4, 4, 4),
                s.rollingMax(Arrays.asList(4, 3, 2, 1)));
        assertEquals(Arrays.asList(3, 3, 3, 100, 100),
                s.rollingMax(Arrays.asList(3, 2, 3, 100, 3)));
    }
}