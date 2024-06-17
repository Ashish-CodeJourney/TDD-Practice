# Configure Your Own Wardrobe

## Problem Statement

Imagine you have just moved into your new apartment, and you notice that you still need a new wardrobe for your dressing room. Regrettably, you won’t find a wardrobe that fits exactly to the size of your wall. Fortunately, a Swedish furniture dealer offers you the opportunity to build your own, customized wardrobe by combining individual wardrobe elements.

The wardrobe elements are available in the following sizes:
- 50 cm
- 75 cm
- 100 cm
- 120 cm

The wall on which the wardrobe elements are placed has a total length of 250 cm. Your task is to determine which combinations of wardrobe elements can be used to exactly fill the wall.

### Objectives

1. Write a function that returns all combinations of wardrobe elements that exactly fill the wall.
2. Write a second function that checks which of the resulting combinations is the cheapest one.

## Available Wardrobe Elements and Prices

The price list for the available wardrobe elements is as follows:

- 50 cm: 59 USD
- 75 cm: 62 USD
- 100 cm: 90 USD
- 120 cm: 111 USD

## Steps to Solve the Problem

### Step 1: Identify All Possible Combinations

First, we need to identify all possible combinations of the given wardrobe elements (50 cm, 75 cm, 100 cm, and 120 cm) that add up to exactly 250 cm. 

#### Test-Driven Development (TDD) Steps:
1. **Write a test** to ensure that a function exists to find combinations that sum to a target length.
2. **Write the function** to generate all possible combinations that add up to 250 cm using the given wardrobe elements.
3. **Verify the function** with the test cases.

### Step 2: Calculate the Cost of Each Combination

For each combination found in Step 1, calculate the total cost based on the given price list.

#### TDD Steps:
1. **Write a test** to ensure that a function exists to calculate the cost of a given combination of wardrobe elements.
2. **Write the function** to compute the cost based on the given price list.
3. **Verify the function** with the test cases.

### Step 3: Identify the Cheapest Combination

Compare the total costs of all valid combinations and identify the one with the lowest cost.

#### TDD Steps:
1. **Write a test** to ensure that a function exists to determine the cheapest combination among the valid combinations.
2. **Write the function** to find the cheapest combination.
3. **Verify the function** with the test cases.

## Summary

By following these steps using TDD, we will:
1. Identify all possible combinations of wardrobe elements that exactly fill a 250 cm wall.
2. Calculate the total cost for each combination.
3. Find the cheapest combination among all valid combinations.

---------------------------------------------------------------------------------------------------------------------
This question is picked up from 
https://kata-log.rocks/configure-wardrobe-kata
