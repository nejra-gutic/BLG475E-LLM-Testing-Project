import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
/**
* Check if in given list of numbers, are any two numbers closer to each other than given threshold.
* >>> hasCloseElements(Arrays.asList(1.0, 2.0, 3.0), 0.5)
* false
* >>> hasCloseElements(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0), 0.3)
* true
*/
public boolean hasCloseElements(List<Double> numbers, double threshold) {
if (numbers == null || numbers.size() < 2) {
return false;
}

    List<Double> sortedNumbers = new ArrayList<>(numbers);
    Collections.sort(sortedNumbers);

    for (int i = 0; i < sortedNumbers.size() - 1; i++) {
        if (sortedNumbers.get(i + 1) - sortedNumbers.get(i) < threshold) {
            return true;
        }
    }

    return false;
}
}
