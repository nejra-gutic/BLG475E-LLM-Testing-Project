import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a string, find out how many distinct characters (regardless of case) does it consist of
    >>> countDistinctCharacters("xyzXYZ")
    3
    >>> countDistinctCharacters("Jerry")
    4
     */
    public int countDistinctCharacters(String string) {
        Set<Character> distinct = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            distinct.add(Character.toLowerCase(string.charAt(i)));
        }

        return distinct.size();
    }
}
