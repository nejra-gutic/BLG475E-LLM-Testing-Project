package task20;

import java.util.*;
import java.lang.*;

class Solution {
/**
From a supplied list of numbers (of length at least two) select and return two that are the closest to each
other and return them in order (smaller number, larger number).
>>> findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2))
[2.0, 2.2]
>>> findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0))
[2.0, 2.0]
*/
public List<Double> findClosestElements(List<Double> numbers) {
List<Double> sortedNumbers = new ArrayList<>(numbers);
Collections.sort(sortedNumbers);

    double minDiff = Double.MAX_VALUE;
    double first = 0;
    double second = 0;
    
    for (int i = 0; i < sortedNumbers.size() - 1; i++) {
        double diff = sortedNumbers.get(i + 1) - sortedNumbers.get(i);
        if (diff < minDiff) {
            minDiff = diff;
            first = sortedNumbers.get(i);
            second = sortedNumbers.get(i + 1);
        }
    }
    
    return Arrays.asList(first, second);
}
}
