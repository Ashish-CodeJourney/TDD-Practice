# Banking Kata

## Overview
Create a simple bank application with features for depositing, withdrawing, and printing account statements.

## Constraints

1. Start with a class with the following structure:

    ```java
    public class Account {
      public void deposit(int amount)
      public void withdraw(int amount)
      public void printStatement()
    }
    ```

2. You are not allowed to add any other public methods in this class.

3. Use Strings and Integers for dates and amounts to keep it simple.

4. Don’t worry about the spacing in the statement printed in the console.

## Requirements

1. **Deposit into Account**

    - Example Input: 
      - `deposit(1000)` on "01/04/2014"
      - `deposit(500)` on "10/04/2014"
    - Example Output:
      - Account balance after the deposits: 1500.00

2. **Withdraw from an Account**

    - Example Input: 
      - `withdraw(100)` on "02/04/2014"
    - Example Output:
      - Account balance after the withdrawal: 1400.00

3. **Print the Account statement to the console**

    - Example Input:
      - After the operations above.
    - Example Output:
    
      ```
      DATE       | AMOUNT  | BALANCE
      10/04/2014 | 500.00  | 1400.00
      02/04/2014 | -100.00 | 900.00
      01/04/2014 | 1000.00 | 1000.00
      ```

## Implementation Using Test-Driven Development (TDD)

### Step 1: Write Test Cases

Before implementing the functionality, write test cases to ensure that the functions work as expected. Use a testing framework to create the tests.

### Step 2: Implement the Functions

Next, implement the `deposit`, `withdraw`, and `printStatement` methods in the `Account` class to pass the tests.

### Step 3: Run the Tests

Run the test suite to ensure all tests pass. If any test fails, revise the functions until all tests pass.
