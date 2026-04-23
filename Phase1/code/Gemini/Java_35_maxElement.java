import java.util.;
import java.lang.;

class Solution {
/**
Return maximum element in the list.
>>> maxElement(Arrays.asList(1, 2, 3))
3
>>> maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
123
*/
public int maxElement(List l) {
int max = l.get(0);
for (int i = 1; i < l.size(); i++) {
if (l.get(i) > max) {
max = l.get(i);
}
}
return max;
}
}
