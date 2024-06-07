### String Calculator

Implement a simple String calculator with a method signature like this:

```java
int add(String numbers)
```

**Input**: A string of comma-separated numbers  
**Output**: An integer, sum of the numbers

#### Examples

- Input: `""`, Output: `0`
- Input: `"1"`, Output: `1`
- Input: `"1,5"`, Output: `6`

**Requirements**:

1. Allow the `add` method to handle any amount of numbers.
2. Allow the `add` method to handle new lines between numbers (in addition to commas). For example, `"1\n2,3"` should return `6`.
3. Support different delimiters:
    - To change the delimiter, the beginning of the string will contain a separate line that looks like this: `"//[delimiter]\n[numbers…]"`. For example, `"//;\n1;2"` should return `3` where the delimiter is `";"`.
4. Calling `add` with a negative number will throw an exception: `"negative numbers not allowed: <negative_number>"`.
    - If there are multiple negative numbers, show all of them in the exception message, separated by commas.

---------------------------------------------------------------------------------------------------------------------