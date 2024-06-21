# Point of Sale Kata

Create a simple app for scanning bar codes to sell products.

## Requirements

1. **Known Bar Codes**:
    - Barcode '12345' should display price '$7.25'.
    - Barcode '23456' should display price '$12.50'.

    - Example Input: '12345'
    - Example Output: '$7.25'

    - Example Input: '23456'
    - Example Output: '$12.50'

2. **Unknown Bar Code**:
    - Barcode '99999' should display 'Error: barcode not found'.

    - Example Input: '99999'
    - Example Output: 'Error: barcode not found'

3. **Empty Bar Code**:
    - Empty barcode should display 'Error: empty barcode'.

    - Example Input: ''
    - Example Output: 'Error: empty barcode'

4. **Total Command**:
    - Introduce a concept of total command where it is possible to scan multiple items. The command should display the sum of the scanned product prices.

    - Example Input: ['12345', '23456']
    - Example Output: '$19.75'

## Implementation Using Test-Driven Development (TDD)

### Step 1: Write Test Cases

Before implementing the functionality, write test cases to ensure that the function works as expected.

### Step 2: Implement the Function

Next, implement the `scan_barcode` function to pass the tests.

### Step 3: Run the Tests

Run the test suite to ensure all tests pass. If any test fails, revise the function until all tests pass.
