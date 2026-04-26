package task14;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testAllPrefixes() {
        Solution s = new Solution();

        assertEquals(List.of(), s.allPrefixes(""));
        assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"),
                s.allPrefixes("asdfgh"));
        assertEquals(Arrays.asList("W", "WW", "WWW"),
                s.allPrefixes("WWW"));
    }
}