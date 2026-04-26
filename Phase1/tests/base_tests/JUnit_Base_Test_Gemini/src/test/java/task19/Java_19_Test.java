package task19;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testSortNumbers() {
        assertEquals("", s.sortNumbers(""));
        assertEquals("three", s.sortNumbers("three"));
        assertEquals("three five nine", s.sortNumbers("three five nine"));
        assertEquals("zero four five seven eight nine",
                s.sortNumbers("five zero four seven nine eight"));
    }
}
