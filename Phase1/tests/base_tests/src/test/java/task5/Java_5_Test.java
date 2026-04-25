package task5;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testIntersperse() {
        Solution s = new Solution();

        assertEquals(List.of(), s.intersperse(List.of(), 7));
        assertEquals(Arrays.asList(5, 8, 6, 8, 3, 8, 2),
                s.intersperse(Arrays.asList(5, 6, 3, 2), 8));
        assertEquals(Arrays.asList(2, 2, 2, 2, 2),
                s.intersperse(Arrays.asList(2, 2, 2), 2));
    }
}