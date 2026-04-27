/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task25;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – prime number
    @Test void mt25_prime() {
        assertEquals(Arrays.asList(7), s.factorize(7));
    }

    // EC – 1 (edge case – no prime factors)
    @Test void mt25_n1() {
        // Depending on implementation; must not throw
        assertDoesNotThrow(() -> s.factorize(1));
    }

    // BVA – n = 2 (smallest prime)
    @Test void mt25_n2() {
        assertEquals(Arrays.asList(2), s.factorize(2));
    }

    // Mutation: result must multiply back to n
    @Test void mt25_productEqualsN() {
        int n = 60;
        List<Integer> factors = s.factorize(n);
        int product = 1;
        for (int f : factors) product *= f;
        assertEquals(n, product);
    }

    // Mutation: all factors must be prime
    @Test void mt25_allFactorsPrime() {
        for (int f : s.factorize(360)) {
            assertTrue(isPrime(f), f + " is not prime");
        }
    }

    // BVA – n = power of 2
    @Test void mt25_powerOfTwo() {
        assertEquals(Arrays.asList(2, 2, 2, 2), s.factorize(16));
    }

    // Mutation: factors must be sorted in non-decreasing order
    @Test void mt25_sortedFactors() {
        List<Integer> factors = s.factorize(2 * 3 * 5 * 7);
        for (int i = 0; i < factors.size() - 1; i++) {
            assertTrue(factors.get(i) <= factors.get(i + 1));
        }
    }

    // EC – large semi-prime
    @Test void mt25_semiPrime() {
        assertEquals(Arrays.asList(11, 13), s.factorize(143));
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
}
