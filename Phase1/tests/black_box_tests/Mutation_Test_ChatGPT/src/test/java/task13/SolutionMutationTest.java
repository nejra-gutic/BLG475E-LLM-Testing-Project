/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task13;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – one of them is 1 (GCD = 1)
    @Test void mt13_oneIsOne() {
        assertEquals(1, s.greatestCommonDivisor(1, 100));
    }

    // EC – same numbers (GCD = number itself)
    @Test void mt13_sameNumbers() {
        assertEquals(7, s.greatestCommonDivisor(7, 7));
    }

    // EC – one is multiple of other
    @Test void mt13_multipleOf() {
        assertEquals(6, s.greatestCommonDivisor(6, 12));
    }

    // BVA – GCD = 1 (coprimes)
    @Test void mt13_coprimes() {
        assertEquals(1, s.greatestCommonDivisor(13, 17));
    }

    // Mutation: symmetry (GCD is commutative)
    @Test void mt13_commutative() {
        assertEquals(s.greatestCommonDivisor(12, 8), s.greatestCommonDivisor(8, 12));
    }

    // Mutation: LCM confusion – GCD must be <= both inputs
    @Test void mt13_resultNotLargerThanInputs() {
        int a = 15, b = 25;
        int gcd = s.greatestCommonDivisor(a, b);
        assertTrue(gcd <= a && gcd <= b);
    }

    // EC – large numbers
    @Test void mt13_largeNumbers() {
        assertEquals(100, s.greatestCommonDivisor(100, 1000));
    }
}
