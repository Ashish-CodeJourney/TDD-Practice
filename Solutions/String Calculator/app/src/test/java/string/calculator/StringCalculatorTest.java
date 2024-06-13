package string.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void testAddEmptyString() {
        StringCalculator stringcalculator = new StringCalculator();
        assertEquals(0, stringcalculator.add(""));
    }

    @Test
    void testAddSingleNumber() {
        StringCalculator stringcalculator = new StringCalculator();
        assertEquals(1, stringcalculator.add("1"));
        assertEquals(5, stringcalculator.add("5"));
    }

    @Test
    void testAddMultipleNumbers() {
        StringCalculator stringcalculator = new StringCalculator();
        assertEquals(6, stringcalculator.add("1,5"));
    }

}
