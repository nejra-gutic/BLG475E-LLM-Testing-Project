import java.util.*;
import java.lang.*;

class Solution {
/**
This function takes a list l and returns a list l' such that
l' is identical to l in the odd indicies, while its values at the even indicies are equal
to the values of the even indicies of l, but sorted.
>>> sortEven(Arrays.asList(1, 2, 3))
[1, 2, 3]
>>> sortEven(Arrays.asList(5, 6, 3, 4))
[3, 6, 5, 4]
*/
public List sortEven(List l) {
List evens = new ArrayList<>();
for (int i = 0; i < l.size(); i += 2) {
evens.add(l.get(i));
}
Collections.sort(evens);

    List<Integer> result = new ArrayList<>(l);
    int evenIdx = 0;
    for (int i = 0; i < l.size(); i += 2) {
        result.set(i, evens.get(evenIdx++));
    }
    return result;
}
}
