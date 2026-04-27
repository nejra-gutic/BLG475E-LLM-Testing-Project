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

    // Mutation: division by n vs n-1 (MAD uses n, not n-1)
    @Test void mt4_divisionCheck() {
        // [0,1,2]: mean=1, deviations=[1,0,1], MAD=2/3
        assertEquals(2.0 / 3.0, s.meanAbsoluteDeviation(Arrays.asList(0.0, 1.0, 2.0)), 1e-6);
    }

    // Mutation: absolute value omitted – asymmetric list
    @Test void mt4_asymmetric() {
        // [1,1,4]: mean=2, |devs|=[1,1,2], MAD=4/3
        assertEquals(4.0 / 3.0, s.meanAbsoluteDeviation(Arrays.asList(1.0, 1.0, 4.0)), 1e-6);
    }
}

