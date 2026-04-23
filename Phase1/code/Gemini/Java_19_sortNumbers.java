import java.util.;
import java.lang.;

class Solution {
/**
Input is a space-delimited string of numberals from 'zero' to 'nine'.
Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
Return the string with numbers sorted from smallest to largest
>>> sortNumbers("three one five")
"one three five"
*/
public String sortNumbers(String numbers) {
if (numbers == null || numbers.isEmpty()) {
return "";
}

    Map<String, Integer> valueMap = new HashMap<>();
    valueMap.put("zero", 0);
    valueMap.put("one", 1);
    valueMap.put("two", 2);
    valueMap.put("three", 3);
    valueMap.put("four", 4);
    valueMap.put("five", 5);
    valueMap.put("six", 6);
    valueMap.put("seven", 7);
    valueMap.put("eight", 8);
    valueMap.put("nine", 9);

    String[] parts = numbers.split("\\s+");
    
    Arrays.sort(parts, new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return valueMap.get(s1) - valueMap.get(s2);
        }
    });

    return String.join(" ", parts);
}
}
