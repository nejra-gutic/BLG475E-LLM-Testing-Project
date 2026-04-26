package task37;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testSortEven() {
        assertEquals(Arrays.asList(1, 2, 3),
                s.sortEven(new ArrayList<>(Arrays.asList(1, 2, 3))));

        assertEquals(Arrays.asList(3, 6, 5, 4),
                s.sortEven(new ArrayList<>(Arrays.asList(5, 6, 3, 4))));
    }
}
