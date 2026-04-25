package task25;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testFactorize() {
        assertEquals(List.of(2), s.factorize(2));
        assertEquals(Arrays.asList(2, 2), s.factorize(4));
        assertEquals(Arrays.asList(2, 2, 2), s.factorize(8));
        assertEquals(Arrays.asList(3, 19), s.factorize(3 * 19));
        assertEquals(Arrays.asList(3, 3, 19, 19), s.factorize(3 * 19 * 3 * 19));
    }
}
