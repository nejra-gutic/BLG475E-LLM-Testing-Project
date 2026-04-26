# Test Smell Analysis

## General Observation

Most of the provided base tests are functional, but many of them contain common test smell problems.

The most common issues are:
- too many assertions inside one test
- vague test names
- missing edge cases
- limited input variety

---

# Problem #0 - HasCloseElements

Problems noticed:
- 5 assertions inside one method
- generic test name
- missing empty list and single element cases

---

# Problem #1 - SeparateParenGroups

Problems noticed:
- multiple assertions grouped together
- vague test name
- missing empty string test
- no invalid parentheses test

---

# Problem #2 - TruncateNumber

Problems noticed:
- only positive numbers tested
- no zero or negative number cases
- multiple assertions in one test

---

# Problem #3 - BelowZero

Problems noticed:
- too many assertions
- missing null input test
- missing single element case

---

# Problem #4 - MeanAbsoluteDeviation

Problems noticed:
- only positive values tested
- no empty list case
- several assertions grouped together

---

# Problem #5 - Intersperse

Problems noticed:
- multiple assertions in one method
- missing single element test

---

# Problem #6 - ParseNestedParens

Problems noticed:
- missing empty string case
- no single group test
- vague test naming

---

# Problem #7 - FilterBySubstring

Problems noticed:
- too many assertions
- missing null substring test
- missing no-match case

---

# Problem #8 - SumProduct

Problems noticed:
- many assertions inside one method
- no null input test

---

# Problem #9 - RollingMax

Problems noticed:
- several assertions grouped together
- test structure could be cleaner

Edge cases are mostly covered correctly.

---

# Problem #10 - MakePalindrome

Problems noticed:
- too many assertions in one test
- difficult to identify failing case quickly

---

# Problem #11 - StringXor

Problems noticed:
- missing empty string test
- missing single character case

---

# Problem #12 - Longest

Problems noticed:
- generic test naming
- assertions grouped together

Coverage is generally good.

---

# Problem #13 - GCD

Problems noticed:
- no zero input test
- no negative number test
- missing equal number case

---

# Problem #14 - AllPrefixes

Problems noticed:
- vague test naming
- multiple assertions in one method

---

# Problem #16 - CountDistinctCharacters

Problems noticed:
- many assertions grouped together
- could be separated into smaller tests

Coverage is good overall.

---

# Problem #18 - HowManyTimes

Problems noticed:
- multiple assertions combined
- generic test naming

---

# Problem #19 - SortNumbers

Problems noticed:
- vague test name
- many different cases inside one method

---

# Problem #20 - FindClosestElements

Problems noticed:
- missing duplicate closest value case
- multiple assertions grouped together

---

# Problem #22 - FilterIntegers

Problems noticed:
- typo in test name (`testFilterIntergers`)
- assertions bundled together

---

# Problem #24 - LargestDivisor

Problems noticed:
- too many assertions
- missing edge case for value 1
- no large number test

---

# Problem #25 - Factorize

Problems noticed:
- many assertions inside one test
- vague naming

Coverage is acceptable.

---

# Problem #26 - RemoveDuplicates

Problems noticed:
- assertions grouped together
- could use more boundary tests

---

# Problem #28 - Concatenate

Problems noticed:
- vague test naming
- multiple assertions in one method

---

# Problem #30 - GetPositive

Problems noticed:
- grouped assertions
- missing single value test

---

# Problem #32 - FindZero

Problems noticed:
- very limited testing
- only 2 assertions
- more edge cases needed

---

# Problem #35 - MaxElement

Problems noticed:
- very few test cases
- no negative number test
- missing single element case

---

# Problem #37 - SortEven

Problems noticed:
- limited coverage
- no empty list test
- no single element case

---

# Problem #40 - TriplesSumToZero

Problems noticed:
- too many assertions inside one test
- difficult to quickly identify failing input

Coverage is otherwise decent.

---

# Problem #43 - PairsSumToZero

Problems noticed:
- many assertions grouped together
- vague test naming

---

# Overall Conclusion

After analyzing the base tests, the most common test smells were:

- Assertion Roulette (too many assertions in one test)
- Vague test names
- Missing edge cases
- Limited boundary testing

The tests are useful for checking basic functionality, but they could be improved by:
- splitting tests into smaller methods
- using clearer test names
- adding more edge case coverage
