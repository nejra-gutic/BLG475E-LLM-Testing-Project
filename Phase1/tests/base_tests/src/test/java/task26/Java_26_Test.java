package task26;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testRemoveDuplicates() {
        assertEquals(List.of(), s.removeDuplicates(new ArrayList<>()));

        assertEquals(Arrays.asList(1, 2, 3, 4),
                s.removeDuplicates(Arrays.asList(1, 2, 3, 4)));

        assertEquals(Arrays.asList(1, 4, 5),
                s.removeDuplicates(Arrays.asList(1, 2, 3, 2, 4, 3, 5)));
    }
}
