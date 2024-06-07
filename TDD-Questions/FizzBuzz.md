## Problem Description

### FizzBuzz Game

Imagine you are eleven years old, and in the last five minutes of a Maths lesson, your teacher decides to make the class more “fun” by introducing a “game”. He explains that he will point at each pupil in turn and ask them to say the next number in sequence, starting from one. The “fun” part is that if the number is divisible by three, you instead say “Fizz”, and if it is divisible by five, you say “Buzz”. If it is divisible by both three and five, you say “FizzBuzz”.

To avoid embarrassment in front of the class, you need to get the full list printed out so you know what to say. Your class has about 33 pupils and the teacher might go round three times before the bell rings for breaktime. The next maths lesson is on Thursday. Get coding!

### Stage 1

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number, and for multiples of five print “Buzz”. For numbers which are multiples of both three and five, print “FizzBuzz”.

#### Sample Output:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
... etc up to 100
```

### Stage 2 - New Requirements

A number is fizz if:
- It is divisible by 3, or
- It has a 3 in it

A number is buzz if:
- It is divisible by 5, or
- It has a 5 in it

#### Examples:
- `53` should return `FizzBuzz` (contains 5 and 3)
- `35` should return `FizzBuzzBuzz` (contains 3 and 5, and is divisible by 5)

### Your Task

Implement a solution to satisfy both Stage 1 and Stage 2 requirements.

---------------------------------------------------------------------------------------------------------------------
This question is picked up from 
https://codingdojo.org/kata/FizzBuzz/
