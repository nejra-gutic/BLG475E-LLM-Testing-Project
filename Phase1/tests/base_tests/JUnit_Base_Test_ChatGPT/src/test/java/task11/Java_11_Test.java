package task11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testStringXor() {
        Solution s = new Solution();

        assertEquals("010010", s.stringXor("111000", "101010"));
        assertEquals("0", s.stringXor("1", "1"));
        assertEquals("0101", s.stringXor("0101", "0000"));
    }
}