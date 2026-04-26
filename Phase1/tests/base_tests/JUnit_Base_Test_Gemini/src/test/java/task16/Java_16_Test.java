package task16;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void testCountDistinctCharacters() {
        assertEquals(0, s.countDistinctCharacters(""));
        assertEquals(5, s.countDistinctCharacters("abcde"));
        assertEquals(5, s.countDistinctCharacters("abcdecadeCADE"));
        assertEquals(1, s.countDistinctCharacters("aaaaAAAAaaaa"));
        assertEquals(5, s.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }
}