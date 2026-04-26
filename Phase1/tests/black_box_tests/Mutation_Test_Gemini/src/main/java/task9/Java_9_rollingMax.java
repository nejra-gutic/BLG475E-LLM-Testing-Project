package task9;

import java.util.*;
import java.lang.*;

class Solution {
    /**
     From a given list of integers, generate a list of rolling maximum element found until given moment
     in the sequence.
     >>> rollingMax(Arrays.asList(1, 2, 3, 2, 3, 4, 2))
     [1, 2, 3, 3, 3, 4, 4]
     */
    public List<Integer> rollingMax(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        if (numbers == null || numbers.isEmpty()) {
            return result;
        }

        int currentMax = numbers.get(0);
        for (Integer num : numbers) {
            if (num > currentMax) {
                currentMax = num;
            }
            result.add(currentMax);
        }

        return result;
    }
}
