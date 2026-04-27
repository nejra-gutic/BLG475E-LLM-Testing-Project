/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task11;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // Mutation: AND instead of XOR (0&0=0, 1&1=1 differ from 0^0=0, 1^1=0)
    @Test void mt11_xorNotAnd() {
        assertEquals("0", s.stringXor("1", "1"));  // XOR: 1^1=0, AND: 1&1=1
    }

    // Mutation: OR instead of XOR (0|1=1, 1|0=1, same as XOR here but 0|0=0 not 0)
    @Test void mt11_xorNotOr() {
        assertEquals("0", s.stringXor("0", "0"));  // XOR: 0, OR: 0 (same here)
        assertEquals("1", s.stringXor("0", "1"));  // XOR: 1, XNOR: 0
    }

    // EC – all zeros
    @Test void mt11_allZeros() {
        assertEquals("000", s.stringXor("000", "000"));
    }

    // EC – all ones
    @Test void mt11_allOnes() {
        assertEquals("000", s.stringXor("111", "111"));
    }

    // EC – identity: XOR with itself is all zeros
    @Test void mt11_selfXor() {
        assertEquals("00000", s.stringXor("10110", "10110"));
    }

    // BVA – single character inputs
    @Test void mt11_singleCharZeroOne() {
        assertEquals("1", s.stringXor("0", "1"));
        assertEquals("1", s.stringXor("1", "0"));
    }

    // Mutation: output length must equal input length
    @Test void mt11_outputLength() {
        String result = s.stringXor("110100", "010101");
        assertEquals(6, result.length());
    }

    // Mutation: commutativity (XOR is commutative)
    @Test void mt11_commutative() {
        assertEquals(s.stringXor("101010", "110011"),
                     s.stringXor("110011", "101010"));
    }
}
