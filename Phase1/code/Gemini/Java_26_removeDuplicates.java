import java.util.;
import java.lang.;
import java.util.stream.Collectors;

class Solution {
/**
From a list of integers, remove all elements that occur more than once.
Keep order of elements left the same as in the input.
>>> removeDuplicates(Array.asList(1, 2, 3, 2, 4))
[1, 3, 4]
*/
public List removeDuplicates(List numbers) {
if (numbers == null) {
return new ArrayList<>();
}

    Map<Integer, Long> counts = numbers.stream()
        .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()));

    return numbers.stream()
        .filter(n -> counts.get(n) == 1)
        .collect(Collectors.toList());
}
}
