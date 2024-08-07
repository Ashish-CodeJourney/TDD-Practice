# Chandrayaan 3 Lunar Craft: Galactic Space Craft Control

## Description

As a scientist at ISRO controlling the latest lunar spacecraft Chandrayaan 3, your task is to develop a program that translates commands sent from Earth into instructions understood by the spacecraft. The spacecraft navigates through the galaxy using galactic coordinates, represented by x, y, z coordinates (x for east or west location, y for north or south location, and z for distance above or below the galactic plane).

## Requirements

You will be given the initial starting point (x, y, z) of the spacecraft and the direction it is facing (N, S, E, W, Up, Down). The spacecraft receives a character array of commands, and you are required to implement the following functionalities:

- Move the spacecraft forward/backward (f, b): The spacecraft moves one step forward or backward based on its current direction.
- Turn the spacecraft left/right (l, r): The spacecraft rotates 90 degrees to the left or right, changing its facing direction.
- Turn the spacecraft up/down (u, d): The spacecraft changes its angle, rotating upwards or downwards.

### Note

- The spacecraft’s initial direction (N, S, E, W, Up, Down) represents the reference frame for movement and rotation.
- The spacecraft cannot move or rotate diagonally; it can only move in the direction it is currently facing.
- Assume that the spacecraft’s movement and rotations are rigid, and it cannot move beyond the galactic boundaries.

## Example

Given the starting point (0, 0, 0) following (x, y, z) and initial direction N, the following commands should result in the indicated final position and direction:

Commands: ["f", "r", "u", "b", "l"]

- Starting Position: (0, 0, 0)
- Initial Direction: N

```
"f" - (0, 1, 0) - N
"r" - (0, 1, 0) - E
"u" - (0, 1, 0) - U
"b" - (0, 1, -1) - U
"l" - (0, 1, -1) - N
```

- Final Position: (0, 1, -1)
- Final Direction: N

## Instructions for Using TDD

To develop this program using Test-Driven Development (TDD), follow these steps:

1. **Set Up the Project**:
    - Create a basic Java project structure with a `src/main/java` directory for source code and a `src/test/java` directory for tests.
    - Set up a build tool like Maven or Gradle to manage dependencies (e.g., JUnit for testing).

2. **Write the First Failing Test**:
    - Start by writing a simple test to check if the spacecraft moves forward in the initial direction (North).

3. **Implement Minimal Code to Pass the Test**:
    - Write the minimal amount of code necessary to pass the test.

4. **Run the Test**:
    - Run the test to ensure it passes. If it fails, debug and fix the issues.

5. **Write the Next Failing Test**:
    - Add a new test for the next functionality, such as moving forward when facing East.

6. **Implement Minimal Code to Pass the Test**:
    - Update the code to handle the new functionality.

7. **Repeat the Process**:
    - Continue this cycle of writing tests, implementing code to pass the tests, and refactoring until all functionalities are implemented.

8. **Refactor and Add More Tests**:
    - Refactor the code for better readability and maintainability as needed.
    - Add tests to cover edge cases and ensure the code handles all scenarios correctly.

By following these steps, you will develop a robust and well-tested program for controlling the Chandrayaan 3 lunar spacecraft using TDD principles.

## Question curated by

- [2KAbhishek](https://github.com/2KAbhishek)
- [niravchavda99](https://github.com/niravchavda99) 

## Find the blog here
- [Chandrayaan 3 TDD Assessment](https://blog.incubyte.co/blog/chandrayaan-3-tdd-assessment/) 


