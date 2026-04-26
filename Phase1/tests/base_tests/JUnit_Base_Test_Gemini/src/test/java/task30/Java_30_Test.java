package task30;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testGetPositive() {
        assertEquals(Arrays.asList(4, 5, 6),
                s.getPositive(Arrays.asList(-1, -2, 4, 5, 6)));

        assertEquals(Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1),
                s.getPositive(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10)));

        assertEquals(List.of(), s.getPositive(Arrays.asList(-1, -2)));
    }
}