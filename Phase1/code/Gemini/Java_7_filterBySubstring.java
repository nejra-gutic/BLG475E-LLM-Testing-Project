import java.util.*;
import java.lang.*;

class Solution {
/**
Filter an input list of strings only for ones that contain given substring
>>> filterBySubstring(List.of(), "a")
[]
>>> filterBySubstring(Arrays.asList("abc", "bacd", "cde", "array"), "a")
["abc", "bacd", "array"]
*/
public List<String> filterBySubstring(List<String> strings, String substring) {
List<String> result = new ArrayList<>();
if (strings == null || substring == null) {
return result;
}
for (String s : strings) {
if (s.contains(substring)) {
result.add(s);
}
}
return result;
}
}
