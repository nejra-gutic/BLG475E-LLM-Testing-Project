package task18;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testHowManyTimes() {
        assertEquals(0, s.howManyTimes("", "x"));
        assertEquals(4, s.howManyTimes("xyxyxyx", "x"));
        assertEquals(4, s.howManyTimes("cacacacac", "cac"));
        assertEquals(1, s.howManyTimes("john doe", "john"));
    }
}
