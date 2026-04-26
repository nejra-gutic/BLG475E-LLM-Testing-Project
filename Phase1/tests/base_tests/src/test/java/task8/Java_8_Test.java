package task8;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSumProduct() {
        Solution s = new Solution();

        assertEquals(Arrays.asList(0, 1), s.sumProduct(List.of()));
        assertEquals(Arrays.asList(3, 1), s.sumProduct(Arrays.asList(1, 1, 1)));
        assertEquals(Arrays.asList(100, 0), s.sumProduct(Arrays.asList(100, 0)));
        assertEquals(Arrays.asList(15, 105), s.sumProduct(Arrays.asList(3, 5, 7)));
        assertEquals(Arrays.asList(10, 10), s.sumProduct(List.of(10)));
    }
}