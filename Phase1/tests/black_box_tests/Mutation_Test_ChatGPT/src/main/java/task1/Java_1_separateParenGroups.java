package task1;

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Input to this function is a string containing multiple groups of nested parentheses. Your goal is to
    separate those group into separate strings and return the list of those.
    Separate groups are balanced (each open brace is properly closed) and not nested within each other
    Ignore any spaces in the input string.
    >>> separateParenGroups("( ) (( )) (( )( ))")
    ["()", "(())", "(()())"]
    */
    public List<String> separateParenGroups(String paren_string) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        int balance = 0;

        for (int i = 0; i < paren_string.length(); i++) {
            char c = paren_string.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (c == '(') {
                balance++;
                current.append(c);
            } else if (c == ')') {
                balance--;
                current.append(c);

                if (balance == 0) {
                    result.add(current.toString());
                    current.setLength(0);
                }
            }
        }

        return result;
    }
}
