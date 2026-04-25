package task22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testFilterIntegers() {
        assertEquals(List.of(), s.filterIntergers(new ArrayList<>()));

        assertEquals(Arrays.asList(4, 9),
                s.filterIntergers(Arrays.asList(4, Map.of(), List.of(), 23.2, 9, "adasd")));

        assertEquals(Arrays.asList(3, 3, 3),
                s.filterIntergers(Arrays.asList(3, 'c', 3, 3, 'a', 'b')));
    }
}