package task32;

import java.util.*;
import java.lang.*;

class Solution {
    /**
     Evaluates polynomial with coefficients xs at point x.
     return xs[0] + xs[1] * x + xs[2] * x^2 + .... xs[n] * x^n
     */
    public double poly(List<Double> xs, double x) {
        double result = 0;
        for (int i = 0; i < xs.size(); i++) {
            result += xs.get(i) * Math.pow(x, i);
        }
        return result;
    }

    /**
     xs are coefficients of a polynomial.
     findZero find x such that poly(x) = 0.
     findZero returns only only zero point, even if there are many.
     Moreover, findZero only takes list xs having even number of coefficients
     and largest non zero coefficient as it guarantees a solution.
     >>> findZero(Arrays.asList(1.0, 2.0)) // f(x) = 1 + 2x
     -0.5
     */
    public double findZero(List<Double> xs) {
        double lower = -100.0;
        double upper = 100.0;

        // Expand bounds to ensure we bracket the zero
        // Bisection method requires f(lower) and f(upper) to have opposite signs
        while (poly(xs, lower) * poly(xs, upper) > 0) {
            lower *= 2.0;
            upper *= 2.0;
        }

        // Bisection method
        for (int i = 0; i < 100; i++) {
            double mid = (lower + upper) / 2.0;
            if (poly(xs, mid) * poly(xs, lower) > 0) {
                lower = mid;
            } else {
                upper = mid;
            }
        }
        return (lower + upper) / 2.0;
    }
}