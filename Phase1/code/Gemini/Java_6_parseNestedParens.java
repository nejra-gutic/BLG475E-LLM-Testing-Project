import java.util.*;
import java.lang.*;

class Solution {
/**
Input to this function is a string represented multiple groups for nested parentheses separated by spaces.
For each of the group, output the deepest level of nesting of parentheses.
E.g. (()()) has maximum two levels of nesting while ((())) has three.

>>> parseNestedParens("(()()) ((())) () ((())()())")
[2, 3, 1, 3]
 */
public List<Integer> parseNestedParens(String paren_string) {
    List<Integer> result = new ArrayList<>();
    String[] groups = paren_string.split("\\s+");

    for (String group : groups) {
        if (group.isEmpty()) continue;
        
        int currentDepth = 0;
        int maxDepth = 0;
        
        for (char c : group.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            } else if (c == ')') {
                currentDepth--;
            }
        }
        result.add(maxDepth);
    }
    
    return result;
}
}
