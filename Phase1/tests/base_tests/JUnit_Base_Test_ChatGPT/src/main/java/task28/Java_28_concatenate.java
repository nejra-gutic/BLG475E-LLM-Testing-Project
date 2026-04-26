package task28;

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Concatenate list of strings into a single string
    >>> concatenate(List.of())
    ""
    >>> concatenate(Arrays.asList("a", "b", "c"))
    "abc"
     */
    public String concatenate(List<String> strings) {
        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            result.append(s);
        }

        return result.toString();
    }
}
