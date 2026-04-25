package task20;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();
    @Test
    void testFindClosestElements() {
        assertEquals(Arrays.asList(3.9, 4.0),
                s.findClosestElements(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)));

        assertEquals(Arrays.asList(5.0, 5.9),
                s.findClosestElements(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)));

        assertEquals(Arrays.asList(2.0, 2.2),
                s.findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2)));

        assertEquals(Arrays.asList(2.0, 2.0),
                s.findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)));
    }
}
