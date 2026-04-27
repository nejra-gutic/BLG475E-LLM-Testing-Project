/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task8;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC4 – negative integers
    @Test void mt8_negativeIntegers() {
        assertEquals(Arrays.asList(-2, 6),
            s.sumProduct(Arrays.asList(-1, 2, -3)));
    }

    // EC5 – single element
    @Test void mt8_singleElement() {
        assertEquals(Arrays.asList(7, 7), s.sumProduct(Arrays.asList(7)));
    }

    // BVA – all zeros (product = 0, sum = 0)
    @Test void mt8_allZeros() {
        assertEquals(Arrays.asList(0, 0), s.sumProduct(Arrays.asList(0, 0, 0)));
    }

    // Mutation: initial product = 0 instead of 1
    @Test void mt8_emptyProductIsOne() {
        assertEquals(Arrays.asList(0, 1), s.sumProduct(List.of()));
    }

    // Mutation: sum and product swapped in return
    @Test void mt8_sumFirst() {
        List<Integer> result = s.sumProduct(Arrays.asList(2, 3));
        assertEquals(5, (int) result.get(0)); // sum
        assertEquals(6, (int) result.get(1)); // product
    }

    // BVA – two negatives (product positive, sum negative)
    @Test void mt8_twoNegatives() {
        assertEquals(Arrays.asList(-4, 4), s.sumProduct(Arrays.asList(-2, -2)));
    }
}

