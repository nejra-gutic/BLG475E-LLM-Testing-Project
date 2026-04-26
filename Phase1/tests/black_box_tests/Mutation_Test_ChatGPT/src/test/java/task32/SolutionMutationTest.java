/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task32;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC – linear polynomial (2x + 4 = 0 → x = -2)
    @Test void mt32_linearPolynomial() {
        assertEquals(-2.0, s.findZero(Arrays.asList(4.0, 2.0)), 1e-4);
    }

    // EC – polynomial with positive root
    @Test void mt32_positiveRoot() {
        // x - 1 = 0 → root = 1
        assertEquals(1.0, s.findZero(Arrays.asList(-1.0, 1.0)), 1e-4);
    }

    // BVA – simple positive linear: 1x + 0 = 0 → root = 0
    @Test void mt32_rootAtZero() {
        assertEquals(0.0, s.findZero(Arrays.asList(0.0, 1.0)), 1e-4);
    }

    // EC – cubic with known root
    @Test void mt32_cubicRoot() {
        // x³ - 8 = 0 → root = 2
        assertEquals(2.0, s.findZero(Arrays.asList(-8.0, 0.0, 0.0, 1.0)), 1e-2);
    }
}
