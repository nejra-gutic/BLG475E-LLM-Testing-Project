package task0;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testHasCloseElements() {
        Solution s = new Solution();

        assertTrue(s.hasCloseElements(
                Arrays.asList(11.0, 2.0, 3.9, 4.0, 5.0, 2.2), 0.3));

        assertFalse(s.hasCloseElements(
                Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2), 0.05));

        assertTrue(s.hasCloseElements(
                Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0), 0.95));

        assertFalse(s.hasCloseElements(
                Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0), 0.8));

        assertTrue(s.hasCloseElements(
                Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0), 0.1));
    }
}