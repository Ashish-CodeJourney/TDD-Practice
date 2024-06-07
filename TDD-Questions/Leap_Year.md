# Leap Years Kata

This short and simple Kata should be performed in pairs using Test Driven Development (TDD).

## Background

Prior to 1582, the Julian Calendar was widely used, defining leap years as every year divisible by 4. However, by the late 16th century, it was found that the calendar year had drifted from the solar year by approximately 10 days. To address this, the Gregorian Calendar was introduced to thin out the number of leap years and more closely align the calendar year with the solar year. 

The Gregorian Calendar was adopted in Papal countries on October 15, 1582, skipping 10 days from the Julian Calendar date. Protestant countries adopted the Gregorian Calendar after some time.

## User Story

As a user, I want to know if a year is a leap year, so that I can plan for an extra day on February 29th during those years.

## Acceptance Criteria

- All years divisible by 400 **are** leap years (e.g., 2000 was indeed a leap year).
- All years divisible by 100 but not by 400 are **not** leap years (e.g., 1700, 1800, 1900 were not leap years, nor will 2100 be a leap year).
- All years divisible by 4 but not by 100 **are** leap years (e.g., 2008, 2012, 2016).
- All years not divisible by 4 are **not** leap years (e.g., 2017, 2018, 2019).

## Notes

- The Gregorian Calendar could be made more accurate by adding a rule that eliminates years divisible by 4000 as leap years. Consider adding this rule as a second story to extend the exercise.

## Example

| Year  | Leap Year? |
|-------|------------|
| 2000  | Yes        |
| 1700  | No         |
| 2008  | Yes        |
| 2017  | No         |

## Instructions

1. Implement the leap year calculation using TDD.
2. Write tests covering all acceptance criteria.
3. Ensure your code is clean and well-documented.
---------------------------------------------------------------------------------------------------------------------
This question is picked up from 
https://codingdojo.org/kata/LeapYears/
