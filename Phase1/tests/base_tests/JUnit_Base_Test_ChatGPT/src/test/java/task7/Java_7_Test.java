package task7;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testFilterBySubstring() {
        Solution s = new Solution();

        assertEquals(List.of(),
                s.filterBySubstring(List.of(), "john"));

        assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"),
                s.filterBySubstring(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"), "xxx"));

        assertEquals(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx"),
                s.filterBySubstring(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx"), "xx"));

        assertEquals(Arrays.asList("grunt", "prune"),
                s.filterBySubstring(Arrays.asList("grunt", "trumpet", "prune", "gruesome"), "run"));
    }
}