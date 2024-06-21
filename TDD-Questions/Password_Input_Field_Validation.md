# Password Input Field Validation

## Overview

A function is required to validate a password input field for a user registration form. This function should take a string as input and return a validation result. The validation result should include a boolean indicating whether the password is valid and a list of potential validation errors.

## Validation Rules

1. **Minimum Length**: The password must be at least 8 characters long. If this requirement is not met, the error message "Password must be at least 8 characters" should be returned.

2. **Numeric Characters**: The password must contain at least 2 numeric characters. If this requirement is not met, the error message "The password must contain at least 2 numbers" should be returned.

3. **Capital Letters**: The password must contain at least one uppercase letter. If this requirement is not met, the error message "Password must contain at least one capital letter" should be returned.

4. **Special Characters**: The password must contain at least one special character. If this requirement is not met, the error message "Password must contain at least one special character" should be returned.

### Handling Multiple Errors

The validation function should be capable of handling multiple validation errors simultaneously. For instance, if a password does not meet the minimum length requirement and lacks numeric characters, both corresponding error messages should be returned.

## Example

For the input "somepassword", the expected output would be:

```json
{
  "isValid": false,
  "errors": [
    "Password must be at least 8 characters",
    "The password must contain at least 2 numbers"
  ]
}
```

## Task: Implementing Password Validation Using Test-Driven Development (TDD)

### Instructions

1. **Define the Requirements**: Start by understanding the validation rules and requirements for the password validation function.

2. **Write Tests First**: According to TDD principles, write tests for each validation rule before implementing the function. Ensure that the tests cover all possible scenarios, including valid and invalid passwords.

3. **Implement the Function**: After writing the tests, implement the password validation function to pass all the tests.

4. **Refactor**: Once the function passes all the tests, refactor the code if necessary to improve readability and maintainability without breaking the tests.

### Steps to Solve

1. **Create Test Cases**: Write test cases for each validation rule and combinations of rules.

2. **Write the Validation Function**: Implement the function to validate the password according to the defined rules.

3. **Run the Tests**: Ensure all tests pass successfully.

4. **Refactor the Code**: Improve the code quality while keeping the tests green.

### Example Test Cases

1. **Minimum Length Violation**:
   - Input: `"short"`
   - Output: 
     ```json
     {
       "isValid": false,
       "errors": ["Password must be at least 8 characters"]
     }
     ```

2. **Numeric Characters Violation**:
   - Input: `"password"`
   - Output: 
     ```json
     {
       "isValid": false,
       "errors": ["The password must contain at least 2 numbers"]
     }
     ```

3. **Capital Letters Violation**:
   - Input: `"password123"`
   - Output: 
     ```json
     {
       "isValid": false,
       "errors": ["Password must contain at least one capital letter"]
     }
     ```

4. **Special Characters Violation**:
   - Input: `"Password123"`
   - Output: 
     ```json
     {
       "isValid": false,
       "errors": ["Password must contain at least one special character"]
     }
     ```

5. **Multiple Violations**:
   - Input: `"pass"`
   - Output: 
     ```json
     {
       "isValid": false,
       "errors": [
         "Password must be at least 8 characters",
         "The password must contain at least 2 numbers",
         "Password must contain at least one capital letter",
         "Password must contain at least one special character"
       ]
     }
     ```

6. **Valid Password**:
   - Input: `"Password123!"`
   - Output: 
     ```json
     {
       "isValid": true,
       "errors": []
     }
     ```
