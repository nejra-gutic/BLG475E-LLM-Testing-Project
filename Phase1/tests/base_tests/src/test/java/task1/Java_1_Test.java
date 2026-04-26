package task1;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSeparateParenGroups() {
        Solution s = new Solution();

        assertEquals(
                Arrays.asList("(()())", "((()))", "()", "((())()())"),
                s.separateParenGroups("(()()) ((())) () ((())()())")
        );

        assertEquals(
                Arrays.asList("()", "(())", "((()))", "(((())))"),
                s.separateParenGroups("() (()) ((())) (((())))")
        );

        assertEquals(
                Arrays.asList("(()(())((())))"),
                s.separateParenGroups("(()(())((())))")
        );

        assertEquals(
                Arrays.asList("()", "(())", "(()())"),
                s.separateParenGroups("( ) (( )) (( )( ))")
        );
    }
}