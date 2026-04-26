# Test Smell Analysis

## General Observation

Most base tests work correctly, but many of them have some common test smell problems.

The most common issues are:
- too many assertions in one test
- vague test names
- missing edge cases
- limited input variety

---

## Problem #0 - HasCloseElements

Problems noticed:
- 5 assertions inside one test method
- test name is too generic (`testHasCloseElements`)
- missing tests for:
  - empty list
  - single element
  - null input

Because several assertions are grouped together, it is harder to understand which case failed.

---

## Problem #1 - SeparateParenGroups

Problems noticed:
- multiple assertions in one test
- generic test name
- no test for empty string
- no invalid parentheses case

The existing tests cover normal inputs well, but edge cases are missing.

---

## Problem #2 - TruncateNumber

Problems noticed:
- only positive decimal numbers tested
- no negative number cases
- no zero case
- multiple assertions combined in one test

More boundary cases could improve reliability.

---

## Problem #3 - BelowZero

Problems noticed:
- too many assertions in one method
- no null input test
- no single element test

The test already covers several normal cases, but structure could be cleaner.

---

## Problem #4 - MeanAbsoluteDeviation

Problems noticed:
- only positive values tested
- no empty list case
- no single element case
- several assertions grouped together

---

## Common Test Smells Found

### 1. Assertion Roulette
Many tests contain several assertions inside one method.  
When a test fails, it is not immediately clear which input caused the failure.

### 2. Vague Test Names
Most test names are very generic, for example:
- `testGCD`
- `testLongest`
- `testFactorize`

More descriptive names would improve readability.

### 3. Missing Edge Cases
A lot of tests do not check:
- empty inputs
- null values
- single element inputs
- boundary values

---

## Conclusion

The provided base tests are useful for checking basic functionality, but many of them can be improved.

Main improvements:
- split large tests into smaller focused tests
- add better test names
- include more edge cases
