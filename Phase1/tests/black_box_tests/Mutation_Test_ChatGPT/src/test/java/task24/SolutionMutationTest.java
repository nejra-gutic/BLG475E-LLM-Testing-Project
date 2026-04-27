/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task24;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – prime number (largest divisor = 1)
    @Test void mt24_prime() {
        assertEquals(1, s.largestDivisor(13));
        assertEquals(1, s.largestDivisor(97));
    }

    // EC – perfect square
    @Test void mt24_perfectSquare() {
        assertEquals(7, s.largestDivisor(49));
    }

    // BVA – n = 2 (smallest prime)
    @Test void mt24_n2() {
        assertEquals(1, s.largestDivisor(2));
    }

    // BVA – n = 4 (smallest composite)
    @Test void mt24_n4() {
        assertEquals(2, s.largestDivisor(4));
    }

    // Mutation: includes n itself (must be strictly less than n)
    @Test void mt24_notNItself() {
        int result = s.largestDivisor(10);
        assertTrue(result < 10);
        assertEquals(5, result);
    }

    // Mutation: smallest divisor vs largest divisor
    @Test void mt24_largestNotSmallest() {
        // 12: divisors < 12 are 1,2,3,4,6 → largest = 6
        assertEquals(6, s.largestDivisor(12));
    }

    // EC – even number
    @Test void mt24_evenNumber() {
        assertEquals(50, s.largestDivisor(100));
    }

    // Mutation: loop boundary (check i starting from n/2)
    @Test void mt24_largePrime() {
        assertEquals(1, s.largestDivisor(101));
    }
}
