package task6;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testParseNestedParens() {
        Solution s = new Solution();

        assertEquals(Arrays.asList(2, 3, 1, 3),
                s.parseNestedParens("(()()) ((())) () ((())()())"));

        assertEquals(Arrays.asList(1, 2, 3, 4),
                s.parseNestedParens("() (()) ((())) (((())))"));

        assertEquals(Arrays.asList(4),
                s.parseNestedParens("(()(())((())))"));
    }
}