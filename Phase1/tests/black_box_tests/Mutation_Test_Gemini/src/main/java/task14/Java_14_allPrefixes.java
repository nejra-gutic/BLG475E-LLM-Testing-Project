package task14;

import java.util.*;
import java.lang.*;

class Solution {
/**
Return list of all prefixes from shortest to longest of the input string
>>> allPrefixes("abc")
["a", "ab", "abc"]
*/
public List<String> allPrefixes(String string) {
List<String> result = new ArrayList<>();
if (string == null || string.isEmpty()) {
return result;
}

    for (int i = 1; i <= string.length(); i++) {
        result.add(string.substring(0, i));
    }

    return result;
}
}
