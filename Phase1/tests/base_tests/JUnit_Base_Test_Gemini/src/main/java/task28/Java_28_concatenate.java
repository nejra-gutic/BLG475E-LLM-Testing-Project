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
public String concatenate(List strings) {
if (strings == null || strings.isEmpty()) {
return "";
}
StringBuilder sb = new StringBuilder();
for (String s : strings) {
sb.append(s);
}
return sb.toString();
}
}
