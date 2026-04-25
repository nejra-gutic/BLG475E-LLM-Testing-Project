import java.util.*;
import java.lang.*;

class Solution {
/**
For a given list of input numbers, calculate Mean Absolute Deviation
around the mean of this dataset.
Mean Absolute Deviation is the average absolute difference between each
element and a centerpoint (mean in this case):
MAD = average | x - x_mean |
>>> meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0))
1.0
*/
public double meanAbsoluteDeviation(List<Double> numbers) {
if (numbers == null || numbers.isEmpty()) {
return 0.0;
}

    double sum = 0.0;
    for (double n : numbers) {
        sum += n;
    }
    double mean = sum / numbers.size();

    double absoluteDeviationSum = 0.0;
    for (double n : numbers) {
        absoluteDeviationSum += Math.abs(n - mean);
    }

    return absoluteDeviationSum / numbers.size();
}
}
