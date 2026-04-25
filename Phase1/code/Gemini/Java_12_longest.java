import java.util.*;
import java.lang.*;

class Solution {
/**
Out of list of strings, return the longest one. Return the first one in case of multiple
strings of the same length. Return None in case the input list is empty.
>>> longest(List.of())
Optional.empty
>>> longest(Arrays.asList("a", "b", "c"))
Optional[a]
>>> longest(Arrays.asList("a", "bb", "ccc"))
Optional[ccc]
*/
public Optional<String> longest(List<String> strings) {
if (strings == null || strings.isEmpty()) {
return Optional.empty();
}

    String longestStr = strings.get(0);
    for (int i = 1; i < strings.size(); i++) {
        if (strings.get(i).length() > longestStr.length()) {
            longestStr = strings.get(i);
        }
    }

    return Optional.of(longestStr);
}
}
