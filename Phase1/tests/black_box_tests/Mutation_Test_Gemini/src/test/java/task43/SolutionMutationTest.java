/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task43;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – simple pair summing to zero
    @Test void mt43_simplePair() {
        assertTrue(s.pairsSumToZero(Arrays.asList(-3, 3)));
    }

    // EC – pair at beginning and end
    @Test void mt43_pairAtEnds() {
        assertTrue(s.pairsSumToZero(Arrays.asList(-5, 1, 2, 3, 5)));
    }

    // BVA – single element
    @Test void mt43_singleElement() {
        assertFalse(s.pairsSumToZero(Arrays.asList(0)));
    }

    // EC – all positive (no pair sums to zero)
    @Test void mt43_allPositive() {
        assertFalse(s.pairsSumToZero(Arrays.asList(1, 2, 3, 4)));
    }

    // Mutation: same element used twice (zero + zero, distinct indices)
    @Test void mt43_twoZeros() {
        // Two separate 0s: 0+0 = 0 with distinct indices → true
        assertTrue(s.pairsSumToZero(Arrays.asList(0, 0)));
    }

    // Mutation: single zero (can't pair with itself using distinct index)
    @Test void mt43_singleZero() {
        assertFalse(s.pairsSumToZero(Arrays.asList(0, 1, 2)));
    }

    // Mutation: triple vs pair (tripling sums to zero but no pair does)
    @Test void mt43_tripleNotPair() {
        // -1+0+1=0 but no pair: (-1,0)=-1, (-1,1)=0 → actually true
        assertTrue(s.pairsSumToZero(Arrays.asList(-1, 0, 1)));
    }

    // EC – large list with pair at non-obvious positions
    @Test void mt43_pairInMiddle() {
        assertTrue(s.pairsSumToZero(Arrays.asList(10, 20, -20, 30, 40)));
    }

    // Mutation: commutativity — (a+b)=0 same as (b+a)=0
    @Test void mt43_orderIndependence() {
        assertEquals(
            s.pairsSumToZero(Arrays.asList(-5, 1, 2, 3, 5)),
            s.pairsSumToZero(Arrays.asList(5, 3, 2, 1, -5))
        );
    }
}