/* @Authors
 * Student Names: Nejra Gutic, Berkay Emre Keskin, Zeynep Nur Yılmaz
 * Student IDs: 150210925, 150240721, 150220042
 */

package task2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionMutationTest {
    Solution s = new Solution();

    // EC2 – exact integer (decimal part = 0)
    @Test void mt2_exactInteger() {
        assertEquals(0.0, s.truncateNumber(4.0), 1e-6);
    }

    // EC3 – number between 0 and 1
    @Test void mt2_between0and1() {
        assertEquals(0.75, s.truncateNumber(0.75), 1e-6);
    }

    // BVA – just above 0
    @Test void mt2_justAboveZero() {
        assertEquals(0.001, s.truncateNumber(0.001), 1e-6);
    }

    // BVA – just below 1
    @Test void mt2_justBelowOne() {
        assertEquals(0.9999, s.truncateNumber(0.9999), 1e-4);
    }

    // BVA – number = 1.0 (result must be 0.0)
    @Test void mt2_exactOne() {
        assertEquals(0.0, s.truncateNumber(1.0), 1e-6);
    }

    // EC5 – very large number with small decimal
    @Test void mt2_largeNumber() {
        assertEquals(0.001, s.truncateNumber(999999.001), 1e-4);
    }

    // Mutation: subtraction vs modulo – both should agree for positive numbers
    @Test void mt2_standardCase() {
        assertEquals(0.5, s.truncateNumber(3.5), 1e-6);
        assertEquals(0.33, s.truncateNumber(1.33), 1e-6);
        assertEquals(0.456, s.truncateNumber(123.456), 1e-6);
    }
}

