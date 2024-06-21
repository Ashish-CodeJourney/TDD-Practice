# City Search Functionality

## Overview
This document outlines the implementation of a city search functionality. The function takes a string (search text) as input and returns the cities that match the search criteria.

## Prerequisites
Create a collection of strings that will act as a database for the city names:

```
Paris, Budapest, Skopje, Rotterdam, Valencia, Vancouver, Amsterdam, Vienna, Sydney, New York City, London, Bangkok, Hong Kong, Dubai, Rome, Istanbul
```

## Requirements

1. **Minimum Length Check**: If the search text is fewer than 2 characters, the function should return no results. This is an optimization feature of the search functionality.

2. **Exact Start Match**: If the search text is equal to or more than 2 characters, it should return all city names starting with the exact search text. 

   - Example Input: "Va"
   - Example Output: ["Valencia", "Vancouver"]

3. **Case Insensitivity**: The search functionality should be case insensitive.

   - Example Input: "va"
   - Example Output: ["Valencia", "Vancouver"]

4. **Partial Match**: The search functionality should also work when the search text is just a part of a city name.

   - Example Input: "ape"
   - Example Output: ["Budapest"]

5. **Wildcard Character**: If the search text is a "*" (asterisk), the function should return all the city names.

   - Example Input: "*"
   - Example Output: ["Paris", "Budapest", "Skopje", "Rotterdam", "Valencia", "Vancouver", "Amsterdam", "Vienna", "Sydney", "New York City", "London", "Bangkok", "Hong Kong", "Dubai", "Rome", "Istanbul"]

## Implementation Using Test-Driven Development (TDD)

### Step 1: Write Test Cases

Before implementing the functionality, write test cases to ensure that the function works as expected. Use a testing framework to create the tests.

### Step 2: Implement the Function

Next, implement the `city_search` function to pass the tests.

### Step 3: Run the Tests

Run the test suite to ensure all tests pass. If any test fails, revise the function until all tests pass.
