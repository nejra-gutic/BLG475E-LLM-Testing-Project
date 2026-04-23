import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

class Solution {
    /**
    From a list of integers, remove all elements that occur more than once.
    Keep order of elements left the same as in the input.
    >>> removeDuplicates(Array.asList(1, 2, 3, 2, 4))
    [1, 3, 4]
     */
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : numbers) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : numbers) {
            if (frequency.get(num) == 1) {
                result.add(num);
            }
        }

        return result;
    }
}
