/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task4;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC2 – all identical elements (MAD = 0)
    @Test void mt4_allIdentical() {
        assertEquals(0.0, s.meanAbsoluteDeviation(Arrays.asList(5.0, 5.0, 5.0)), 1e-6);
    }

    // EC3 – single element (MAD = 0)
    @Test void mt4_singleElement() {
        assertEquals(0.0, s.meanAbsoluteDeviation(Arrays.asList(7.0)), 1e-6);
    }

    // EC5 – negative numbers
    @Test void mt4_negativeNumbers() {
        assertEquals(2.0 / 3.0, s.meanAbsoluteDeviation(Arrays.asList(-1.0, 0.0, 1.0)), 1e-6);
    }

    // BVA – two elements
    @Test void mt4_twoElements() {
        assertEquals(0.5, s.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0)), 1e-6);
    }
}
