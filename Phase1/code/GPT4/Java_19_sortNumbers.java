import java.util.*;
import java.lang.*;

class Solution {
    /**
    Input is a space-delimited string of numberals from 'zero' to 'nine'.
    Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
    Return the string with numbers sorted from smallest to largest
    >>> sortNumbers("three one five")
    "one three five"
     */
    public String sortNumbers(String numbers) {
        if (numbers == null || numbers.trim().isEmpty()) {
            return "";
        }

        Map<String, Integer> values = new HashMap<>();
        values.put("zero", 0);
        values.put("one", 1);
        values.put("two", 2);
        values.put("three", 3);
        values.put("four", 4);
        values.put("five", 5);
        values.put("six", 6);
        values.put("seven", 7);
        values.put("eight", 8);
        values.put("nine", 9);

        List<String> nums = new ArrayList<>(Arrays.asList(numbers.split(" ")));

        nums.sort(Comparator.comparingInt(values::get));

        return String.join(" ", nums);
    }
}
